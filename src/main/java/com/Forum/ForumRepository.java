package com.Forum;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ForumRepository
        extends JpaRepository<Forum, Long> {

    Optional<Forum> getForumById(Long id);

    @Query(value ="SELECT * FROM forum WHERE book_id=?1", nativeQuery = true)
    Optional<List<Forum>> getPostsForBook(Long bookId);

}