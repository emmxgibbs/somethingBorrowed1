package com.Comment;

import com.Book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final BookRepository bookRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository, BookRepository bookRepository) {
        this.commentRepository = commentRepository;
        this.bookRepository = bookRepository;
    }

    public List<Comment> getComments(){
        return commentRepository.findAll();
    }

    @Transactional
    public Optional<List<Comment>> getCommentsForBook(Long bookId) {
        Optional<List<Comment>> commentByBookId = commentRepository.getCommentByBookId(bookId);
        return commentByBookId;
    }

    @Transactional
    public Optional<List<Comment>> getCommentsForUser(Long userId) {
        Optional<List<Comment>> commentByUser = commentRepository.getCommentByUser(userId);
        return commentByUser;
    }

    public Comment addComment(Comment comment){
        Optional<Comment> commentOptional = commentRepository.getCommentById(comment.getId());
        if (commentOptional.isPresent()){
            throw new IllegalStateException("Comment with that id already exists.");
        }
        return commentRepository.save(comment);
    }

    public void deleteComment(Long commentId){
        boolean existsById = commentRepository.existsById(commentId);
        if (!existsById) {
            throw new IllegalStateException("Comment ID " + commentId + " was not found");
        } else {
            commentRepository.deleteById(commentId);
        }
    }
    public void updateComment(Long commentId, Comment comment){
        String updatedComment = comment.getComment();
        Comment commentToUpdate = commentRepository.getById(commentId);
        boolean existsById = commentRepository.existsById(commentId);
        if (!existsById){
            throw new IllegalStateException("Comment cannot be updated as id does not exist!");
        } else {
            commentToUpdate.setComment(updatedComment);
            System.out.println(commentToUpdate);
            commentRepository.save(commentToUpdate);
        }
    }

}

