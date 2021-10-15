package com.Book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.eq;

public class BookServiceTest {
    @Mock
    private BookRepository bookRepository;

    private BookService underTest;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        underTest = new BookService((bookRepository));
    }

    @Test
    void itCanAddNewBook(){
        Book book = new Book(
                "Harry Potter and the Philosopher's Stone",
                "J.K.Rowling",
                "Harry Potter numero uno!",
                "978-1-40-885565-2",
                "Bloomsbury Children's Books",
                1997,
                5.0,
                "https://www.waterstones.com/book/harry-potter-and-the-philosophers-stone/j-k-rowling/9781408855652",
                "https://cdn.waterstones.com/bookjackets/large/9781/4088/9781408855652.jpg",
                true,
                "childrens");
        Mockito.when(bookRepository.save(eq(book))).thenReturn(book);

        Mockito.when(bookRepository.findAll()).thenReturn(Arrays.asList(
                new Book("Harry Potter and the Chamber of Secrets",
                        "J.K.Rowling",
                        "Harry Potter round 2!",
                        "978-1-40-885566-9",
                        "Bloomsbury Children's Books",
                        1998,
                        4.0,
                        "https://www.waterstones.com/book/harry-potter-and-the-chamber-of-secrets/j-k-rowling/9781408855669",
                        "https://cdn.waterstones.com/bookjackets/large/9781/4088/9781408855669.jpg",
                        false,
                        "childrens"),
                new Book("The Fellowship of the Ring - The Lord of the Rings",
                        "J.R.R.Tolkien",
                        "Frodo",
                        "978-0-26-110357-3",
                        "HarperCollins",
                        1997,
                        4.7,
                        "https://www.waterstones.com/book/the-fellowship-of-the-ring/j-r-r-tolkien/9780261103573",
                        "https://cdn.waterstones.com/bookjackets/large/9780/2611/9780261103573.jpg",
                        false,
                        "fantasy")
        ));

        Book result = underTest.addBook(book);
        ArgumentCaptor<Book> bookArgumentCaptor = ArgumentCaptor.forClass(Book.class);
        Mockito.verify(bookRepository).save(bookArgumentCaptor.capture());

        Book expectedBook = bookArgumentCaptor.getValue();

        assertThat(expectedBook).isEqualTo(book);
        assertThat(book).isEqualTo(book);
    }

    @Test
    void cannotAddBookThatExistsAlready(){
        Book book = new Book(
                "Harry Potter and the Philosopher's Stone",
                "J.K.Rowling",
                "Harry Potter numero uno!",
                "978-1-40-885565-2",
                "Bloomsbury Children's Books",
                1997,
                5.0,
                "https://www.waterstones.com/book/harry-potter-and-the-philosophers-stone/j-k-rowling/9781408855652",
                "https://cdn.waterstones.com/bookjackets/large/9781/4088/9781408855652.jpg",
                true,
                "childrens");
        Book book1 = new Book(
                "Harry Potter and the Philosopher's Stone",
                "J.K.Rowling",
                "Harry Potter numero uno!",
                "978-1-40-885565-2",
                "Bloomsbury Children's Books",
                1997,
                5.0,
                "https://www.waterstones.com/book/harry-potter-and-the-philosophers-stone/j-k-rowling/9781408855652",
                "https://cdn.waterstones.com/bookjackets/large/9781/4088/9781408855652.jpg",
                true,
                "childrens");
        Optional<Book> book2= Optional.of(book1);

        Mockito.when(bookRepository.getBookByTitle(book.getTitle())).thenReturn(book2);
        assertThatThrownBy(() -> {
            underTest.addBook(book);
        }).isInstanceOf(IllegalStateException.class)
                .hasMessage("book already exists");
        Mockito.verify(bookRepository, Mockito.never()).save(book);
    }
    @Test
    void shouldThrowWhenBookTitleIsNull(){
        Book book = new Book(
                null,
                "J.K.Rowling",
                "Harry Potter numero uno!",
                "978-1-40-885565-2",
                "Bloomsbury Children's Books",
                1997,
                5.0,
                "https://www.waterstones.com/book/harry-potter-and-the-philosophers-stone/j-k-rowling/9781408855652",
                "https://cdn.waterstones.com/bookjackets/large/9781/4088/9781408855652.jpg",
                true,
                "childrens");
        assertThatThrownBy(() -> {
            underTest.addBook(book);
        }).hasMessage("Book cannot have empty fields.");
        Mockito.verifyNoInteractions(bookRepository);
    }

    @Test
    void shouldThrowWhenBookAuthorIsNull(){
        Book book = new Book(
                "Harry Potter and the Philosopher's Stone",
                null,
                "Harry Potter numero uno!",
                "978-1-40-885565-2",
                "Bloomsbury Children's Books",
                1997,
                5.0,
                "https://www.waterstones.com/book/harry-potter-and-the-philosophers-stone/j-k-rowling/9781408855652",
                "https://cdn.waterstones.com/bookjackets/large/9781/4088/9781408855652.jpg",
                true,
                "childrens");
        assertThatThrownBy(() -> {
            underTest.addBook(book);
        }).hasMessage("Book cannot have empty fields.");
        Mockito.verifyNoInteractions(bookRepository);
    }

    @Test
    void shouldThrowWhenBookBlurbIsNull(){
        Book book = new Book(
                "Harry Potter and the Philosopher's Stone",
                "J.K.Rowling",
                null,
                "978-1-40-885565-2",
                "Bloomsbury Children's Books",
                1997,
                5.0,
                "https://www.waterstones.com/book/harry-potter-and-the-philosophers-stone/j-k-rowling/9781408855652",
                "https://cdn.waterstones.com/bookjackets/large/9781/4088/9781408855652.jpg",
                true,
                "childrens");
        assertThatThrownBy(() -> {
            underTest.addBook(book);
        }).hasMessage("Book cannot have empty fields.");
        Mockito.verifyNoInteractions(bookRepository);
    }
    @Test
    void shouldThrowWhenBookIsbnIsNull(){
        Book book = new Book(
                "Harry Potter and the Philosopher's Stone",
                "J.K.Rowling",
                "Harry Potter numero uno!",
                null,
                "Bloomsbury Children's Books",
                1997,
                5.0,
                "https://www.waterstones.com/book/harry-potter-and-the-philosophers-stone/j-k-rowling/9781408855652",
                "https://cdn.waterstones.com/bookjackets/large/9781/4088/9781408855652.jpg",
                true,
                "childrens");
        assertThatThrownBy(() -> {
            underTest.addBook(book);
        }).hasMessage("Book cannot have empty fields.");
        Mockito.verifyNoInteractions(bookRepository);
    }

    @Test
    void shouldThrowWhenBookPublisherIsNull(){
        Book book = new Book(
                "Harry Potter and the Philosopher's Stone",
                "J.K.Rowling",
                "Harry Potter numero uno!",
                "978-1-40-885565-2",
                null,
                1997,
                5.0,
                "https://www.waterstones.com/book/harry-potter-and-the-philosophers-stone/j-k-rowling/9781408855652",
                "https://cdn.waterstones.com/bookjackets/large/9781/4088/9781408855652.jpg",
                true,
                "childrens");
        assertThatThrownBy(() -> {
            underTest.addBook(book);
        }).hasMessage("Book cannot have empty fields.");
        Mockito.verifyNoInteractions(bookRepository);
    }
    @Test
    void shouldThrowWhenBookYearIsZero(){
        Book book = new Book(
                "Harry Potter and the Philosopher's Stone",
                "J.K.Rowling",
                "Harry Potter numero uno!",
                "978-1-40-885565-2",
                "Bloomsbury Children's Books",
                0,
                5.0,
                "https://www.waterstones.com/book/harry-potter-and-the-philosophers-stone/j-k-rowling/9781408855652",
                "https://cdn.waterstones.com/bookjackets/large/9781/4088/9781408855652.jpg",
                true,
                "childrens");
        assertThatThrownBy(() -> {
            underTest.addBook(book);
        }).hasMessage("Book cannot have empty fields.");
        Mockito.verifyNoInteractions(bookRepository);
    }
    @Test
    void shouldThrowWhenBookRatingIsNull(){
        Book book = new Book(
                "Harry Potter and the Philosopher's Stone",
                "J.K.Rowling",
                "Harry Potter numero uno!",
                "978-1-40-885565-2",
                "Bloomsbury Children's Books",
                1997,
                0.0,
                "https://www.waterstones.com/book/harry-potter-and-the-philosophers-stone/j-k-rowling/9781408855652",
                "https://cdn.waterstones.com/bookjackets/large/9781/4088/9781408855652.jpg",
                true,
                "childrens");
        assertThatThrownBy(() -> {
            underTest.addBook(book);
        }).hasMessage("Book cannot have empty fields.");
        Mockito.verifyNoInteractions(bookRepository);
    }

    @Test
    void shouldThrowWhenBookBuyLinkIsNull(){
        Book book = new Book(
                "Harry Potter and the Philosopher's Stone",
                "J.K.Rowling",
                "Harry Potter numero uno!",
                "978-1-40-885565-2",
                "Bloomsbury Children's Books",
                1997,
                5.0,
                null,
                "https://cdn.waterstones.com/bookjackets/large/9781/4088/9781408855652.jpg",
                true,
                "childrens");
        assertThatThrownBy(() -> {
            underTest.addBook(book);
        }).hasMessage("Book cannot have empty fields.");
        Mockito.verifyNoInteractions(bookRepository);
    }

    @Test
    void shouldThrowWhenBookImageLinkIsNull(){
        Book book = new Book(
                "Harry Potter and the Philosopher's Stone",
                "J.K.Rowling",
                "Harry Potter numero uno!",
                "978-1-40-885565-2",
                "Bloomsbury Children's Books",
                1997,
                5.0,
                "https://www.waterstones.com/book/harry-potter-and-the-philosophers-stone/j-k-rowling/9781408855652",
                null,
                true,
                "childrens");
        assertThatThrownBy(() -> {
            underTest.addBook(book);
        }).hasMessage("Book cannot have empty fields.");
        Mockito.verifyNoInteractions(bookRepository);
    }

    @Test
    void shouldThrowWhenBookGenreIsNull(){
        Book book = new Book(
                "Harry Potter and the Philosopher's Stone",
                "J.K.Rowling",
                "Harry Potter numero uno!",
                "978-1-40-885565-2",
                "Bloomsbury Children's Books",
                1997,
                5.0,
                "https://www.waterstones.com/book/harry-potter-and-the-philosophers-stone/j-k-rowling/9781408855652",
                "https://cdn.waterstones.com/bookjackets/large/9781/4088/9781408855652.jpg",
                true,
                null);
        assertThatThrownBy(() -> {
            underTest.addBook(book);
        }).hasMessage("Book cannot have empty fields.");
        Mockito.verifyNoInteractions(bookRepository);
    }

    @Test
    void cannotDeletePlantWhenPlantDoesNotExist() {
        Book book = new Book("Harry Potter and the Philosopher's Stone",
                "J.K.Rowling",
                "Harry Potter numero uno!",
                "978-1-40-885565-2",
                "Bloomsbury Children's Books",
                0,
                5.0,
                "https://www.waterstones.com/book/harry-potter-and-the-philosophers-stone/j-k-rowling/9781408855652",
                "https://cdn.waterstones.com/bookjackets/large/9781/4088/9781408855652.jpg",
                true,
                "childrens");
        Long bookId = book.getId();
        Mockito.when(bookRepository.findAll()).thenReturn(Arrays.asList(
                new Book("Harry Potter and the Chamber of Secrets",
                        "J.K.Rowling",
                        "Harry Potter round 2!",
                        "978-1-40-885566-9",
                        "Bloomsbury Children's Books",
                        1998,
                        4.0,
                        "https://www.waterstones.com/book/harry-potter-and-the-chamber-of-secrets/j-k-rowling/9781408855669",
                        "https://cdn.waterstones.com/bookjackets/large/9781/4088/9781408855669.jpg",
                        false,
                        "childrens"),
                new Book("The Fellowship of the Ring - The Lord of the Rings",
                        "J.R.R.Tolkien",
                        "Frodo",
                        "978-0-26-110357-3",
                        "HarperCollins",
                        1997,
                        4.7,
                        "https://www.waterstones.com/book/the-fellowship-of-the-ring/j-r-r-tolkien/9780261103573",
                        "https://cdn.waterstones.com/bookjackets/large/9780/2611/9780261103573.jpg",
                        false,
                        "fantasy")
        ));
        assertThatThrownBy(() -> {
            underTest.deleteBook(bookId);
        }).isInstanceOf(IllegalStateException.class)
                .hasMessage("book ID " + bookId + " was not found");
        Mockito.verify(bookRepository, Mockito.never()).delete(book);
    }
}
