package com.Comment;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @SequenceGenerator(
            name = "comment_sequence",
            sequenceName = "comment_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "comment_sequence"
    )

    Long id;
    Long userId;
    Long bookId;
    @Lob
    String comment;

    public Comment() {
    }

    public Comment(Long id, Long userId, Long bookId, String comment) {
        this.id = id;
        this.userId = userId;
        this.bookId = bookId;
        this.comment = comment;
    }

    public Comment(Long userId, Long bookId, String comment) {
        this.userId = userId;
        this.bookId = bookId;
        this.comment = comment;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment1 = (Comment) o;
        return Objects.equals(id, comment1.id) && Objects.equals(userId, comment1.userId) && Objects.equals(bookId, comment1.bookId) && Objects.equals(comment, comment1.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, bookId, comment);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", userId=" + userId +
                ", bookId=" + bookId +
                ", comment='" + comment + '\'' +
                '}';
    }
}
