package com.Forum;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "forum")
public class Forum {
    @Id
    @SequenceGenerator(
            name = "forum_sequence",
            sequenceName = "forum_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "forum_sequence"
    )

    Long id;
    Long userId;
    Long bookId;
    @Lob
    String forumPost;

    public Forum() {
    }

    public Forum(Long id, Long userId, Long bookId, String forumPost) {
        this.id = id;
        this.userId = userId;
        this.bookId = bookId;
        this.forumPost = forumPost;
    }

    public Forum(Long userId, Long bookId, String forumPost) {
        this.userId = userId;
        this.bookId = bookId;
        this.forumPost = forumPost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getForumPost() {
        return forumPost;
    }

    public void setForumPost(String forumPost) {
        this.forumPost = forumPost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Forum forum = (Forum) o;
        return Objects.equals(id, forum.id) && Objects.equals(userId, forum.userId) && Objects.equals(bookId, forum.bookId) && Objects.equals(forumPost, forum.forumPost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, bookId, forumPost);
    }

    @Override
    public String toString() {
        return "Forum{" +
                "id=" + id +
                ", userId=" + userId +
                ", bookId=" + bookId +
                ", forumPost='" + forumPost + '\'' +
                '}';
    }
}