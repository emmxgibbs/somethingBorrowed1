package com.Book;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Book {
    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "book_sequence"
    )

    Long id;
    String title;
    String author;
    @Lob
    String blurb;
    String isbn;
    String publisher;
    int year;
    Double rating;
    String buyLink;
    String imageLink;
    boolean borrowed;
    String genre;

    public Book(String title, String author, String blurb, String isbn, String publisher, int year, Double rating, String buyLink, String imageLink, boolean borrowed, String genre) {
        this.title = title;
        this.author = author;
        this.blurb = blurb;
        this.isbn = isbn;
        this.publisher = publisher;
        this.year = year;
        this.rating = rating;
        this.buyLink = buyLink;
        this.imageLink = imageLink;
        this.borrowed = borrowed;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getBuyLink() {
        return buyLink;
    }

    public void setBuyLink(String buyLink) {
        this.buyLink = buyLink;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && borrowed == book.borrowed && Objects.equals(id, book.id) && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(blurb, book.blurb) && Objects.equals(isbn, book.isbn) && Objects.equals(publisher, book.publisher) && Objects.equals(rating, book.rating) && Objects.equals(buyLink, book.buyLink) && Objects.equals(imageLink, book.imageLink) && Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, blurb, isbn, publisher, year, rating, buyLink, imageLink, borrowed, genre);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", blurb='" + blurb + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                ", buyLink='" + buyLink + '\'' +
                ", imageLink='" + imageLink + '\'' +
                ", borrowed=" + borrowed +
                ", genre='" + genre + '\'' +
                '}';
    }
}

