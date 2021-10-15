package com.Forum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "somethingBorrowed/forum")
public class ForumController {

    private final ForumService forumService;

    @Autowired
    public ForumController(ForumService forumService){
        this.forumService = forumService;
    }

    @GetMapping
    public List<Forum> getPosts() {
        return forumService.getPosts();
    }

    @GetMapping(path = "{bookId}")
    public Optional<List<Forum>> getPostsForBook(@PathVariable("bookId") Long bookId){
        return forumService.getPostsForBook(bookId);
    }

    @PostMapping
    public void addPost(@RequestBody Forum forumPost){
        forumService.addPost(forumPost);
    }

    @PutMapping(path = "{forumPostId}")
    public void updatePost(@PathVariable("forumPostId") Long forumPostId, @RequestBody Forum forumPost){
        forumService.updatePost(forumPostId, forumPost);
    }

    @DeleteMapping (path = "{forumPostId}")
    public void deletePost(@PathVariable("forumPostId") Long forumPostId){
        forumService.deletePost(forumPostId);
    }

}
