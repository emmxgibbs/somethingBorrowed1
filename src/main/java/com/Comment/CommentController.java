package com.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "somethingBorrowed/comment")
public class CommentController {

    private CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService){
        this.commentService = commentService;
    }

    @GetMapping
    public List<Comment> getComment() {
        return commentService.getComments();
    }


    @GetMapping(path = "book/{bookId}")
    public Optional<List<Comment>> getCommentForBook(@PathVariable("bookId") Long bookId){
        return commentService.getCommentsForBook(bookId);
    }

    @GetMapping(path = "user/{userId}")
    public Optional<List<Comment>> getCommentForUser(@PathVariable("userId") Long userId){
        return commentService.getCommentsForUser(userId);
    }

    @PostMapping
    public void addComment(@RequestBody Comment comment){
        commentService.addComment(comment);
    }

    @PutMapping(path = "{commentId}")
    public void updateComment(@PathVariable("commentId") Long commentId, @RequestBody Comment comment){
        commentService.updateComment(commentId, comment);
    }

    @DeleteMapping (path = "{commentId}")
    public void deleteComment(@PathVariable("commentId") Long commentId){
        commentService.deleteComment(commentId);
    }

}