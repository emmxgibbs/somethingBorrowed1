package com.Comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommentRepository
        extends JpaRepository<Comment, Long> {

    Optional<Comment> getCommentById(Long id);

    @Query(value ="SELECT * FROM comment WHERE book_id=?1", nativeQuery = true)
    Optional<List<Comment>> getCommentByBookId(Long bookId);

    @Query(value ="SELECT * FROM comment WHERE user_id=?1", nativeQuery = true)
    Optional<List<Comment>> getCommentByUser(Long userId);
}
