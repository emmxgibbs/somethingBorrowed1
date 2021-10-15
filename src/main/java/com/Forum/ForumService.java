package com.Forum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ForumService {
    private final ForumRepository forumRepository;

    @Autowired
    public ForumService(ForumRepository forumRepository) {
        this.forumRepository = forumRepository;
    }

    public List<Forum> getPosts(){
        return forumRepository.findAll();
    }

    @Transactional
    public Optional<List<Forum>> getPostsForBook(Long bookId) {
        Optional<List<Forum>> postsForBook = forumRepository.getPostsForBook(bookId);
        return postsForBook;
    }


    public Forum addPost(Forum forum){
        Optional<Forum> postOptional = forumRepository.getForumById(forum.getId());
        if (postOptional.isPresent()){
            throw new IllegalStateException("Forum post with that id already exists.");
        }
        return forumRepository.save(forum);
    }

    public void deletePost(Long forumId){
        boolean existsById = forumRepository.existsById(forumId);
        if (!existsById) {
            throw new IllegalStateException("Forum Post ID " + forumId + " was not found");
        } else {
            forumRepository.deleteById(forumId);
        }
    }

    public void updatePost(Long forumId, Forum forum){
        String updatedPost = forum.getForumPost();
        Forum forumToUpdate = forumRepository.getById(forumId);
        boolean existsById = forumRepository.existsById(forumId);
        if (!existsById){
            throw new IllegalStateException("Post cannot be updated as id does not exist!");
        } else {
            forumToUpdate.setForumPost(updatedPost);
            System.out.println(forumToUpdate);
            forumRepository.save(forumToUpdate);
        }
    }

}