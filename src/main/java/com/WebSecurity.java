package com;


import com.Authentication.AuthenticationRequestFilter;
import com.Book.Book;
import com.Book.BookRepository;
import com.Comment.Comment;
import com.Comment.CommentRepository;
import com.Forum.Forum;
import com.Forum.ForumRepository;
import com.Quotes.Quotes;
import com.Quotes.QuotesRepository;
import com.Trade.Trade;
import com.Trade.TradeRepository;
import com.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.User.MyUserDetailsService;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.util.List;
import java.util.Optional;

@EnableGlobalMethodSecurity(prePostEnabled=true)
@EnableWebSecurity
@EnableJpaRepositories(basePackageClasses= UserRepository.class)
@Configuration
public class WebSecurity extends WebSecurityConfigurerAdapter{

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Autowired
    private AuthenticationRequestFilter authenticationRequestFilter;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("**/secure/**").authenticated()
                .antMatchers("/html/**", "/images/**", "/css/**", "/js/**", "/font/**", "/img/**", "/ExerciseImg/**").permitAll()
                .antMatchers("/authenticate", "/register", "/home", "/login", "/search", "/trade", "/somethingBorrowed/book", "/somethingBorrowed/forum").permitAll()
                .anyRequest().permitAll()
                .and().formLogin().loginPage("/login").successForwardUrl("/rest/secured/loginSuccess").permitAll()
                .and().logout().logoutSuccessUrl("/login?logout")
                .and().sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.addFilterBefore(authenticationRequestFilter, UsernamePasswordAuthenticationFilter.class);
    }

    @Bean
    public BookRepository bookRepository() {
        return new BookRepository() {
            @Override
            public Optional<List<Book>> getBooksAlphabetically() {
                return Optional.empty();
            }

            @Override
            public Optional<Book> getBookByTitle(String title) {
                return Optional.empty();
            }

            @Override
            public Optional<List<Book>> getBookByGenre(String genre) {
                return Optional.empty();
            }

            @Override
            public Optional<List<Book>> getBookByAuthor(String author) {
                return Optional.empty();
            }

            @Override
            public Optional<List<Book>> getUsersBookToTrade(Long userId) {
                return Optional.empty();
            }

            @Override
            public Optional<List<Book>> getAvailableBooksToTrade(Long userId) {
                return Optional.empty();
            }

            @Override
            public List<Book> findAll() {
                return null;
            }

            @Override
            public List<Book> findAll(Sort sort) {
                return null;
            }

            @Override
            public List<Book> findAllById(Iterable<Long> longs) {
                return null;
            }

            @Override
            public <S extends Book> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Book> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Book> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Book> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Long> longs) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Book getOne(Long aLong) {
                return null;
            }

            @Override
            public Book getById(Long aLong) {
                return null;
            }

            @Override
            public <S extends Book> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Book> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<Book> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Book> S save(S entity) {
                return null;
            }

            @Override
            public Optional<Book> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Long aLong) {

            }

            @Override
            public void delete(Book entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Long> longs) {

            }

            @Override
            public void deleteAll(Iterable<? extends Book> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends Book> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Book> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Book> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Book> boolean exists(Example<S> example) {
                return false;
            }
        };
    }

    @Bean
    public CommentRepository commentRepository() {
        return new CommentRepository() {
            @Override
            public Optional<Comment> getCommentById(Long id) {
                return Optional.empty();
            }

            @Override
            public Optional<List<Comment>> getCommentByBookId(Long bookId) {
                return Optional.empty();
            }

            @Override
            public Optional<List<Comment>> getCommentByUser(Long userId) {
                return Optional.empty();
            }

            @Override
            public List<Comment> findAll() {
                return null;
            }

            @Override
            public List<Comment> findAll(Sort sort) {
                return null;
            }

            @Override
            public List<Comment> findAllById(Iterable<Long> longs) {
                return null;
            }

            @Override
            public <S extends Comment> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Comment> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Comment> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Comment> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Long> longs) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Comment getOne(Long aLong) {
                return null;
            }

            @Override
            public Comment getById(Long aLong) {
                return null;
            }

            @Override
            public <S extends Comment> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Comment> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<Comment> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Comment> S save(S entity) {
                return null;
            }

            @Override
            public Optional<Comment> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Long aLong) {

            }

            @Override
            public void delete(Comment entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Long> longs) {

            }

            @Override
            public void deleteAll(Iterable<? extends Comment> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends Comment> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Comment> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Comment> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Comment> boolean exists(Example<S> example) {
                return false;
            }
        };
    }

    @Bean
    public ForumRepository forumRepository() {
        return new ForumRepository() {
            @Override
            public Optional<Forum> getForumById(Long id) {
                return Optional.empty();
            }

            @Override
            public Optional<List<Forum>> getPostsForBook(Long bookId) {
                return Optional.empty();
            }

            @Override
            public List<Forum> findAll() {
                return null;
            }

            @Override
            public List<Forum> findAll(Sort sort) {
                return null;
            }

            @Override
            public List<Forum> findAllById(Iterable<Long> longs) {
                return null;
            }

            @Override
            public <S extends Forum> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Forum> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Forum> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Forum> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Long> longs) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Forum getOne(Long aLong) {
                return null;
            }

            @Override
            public Forum getById(Long aLong) {
                return null;
            }

            @Override
            public <S extends Forum> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Forum> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<Forum> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Forum> S save(S entity) {
                return null;
            }

            @Override
            public Optional<Forum> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Long aLong) {

            }

            @Override
            public void delete(Forum entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Long> longs) {

            }

            @Override
            public void deleteAll(Iterable<? extends Forum> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends Forum> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Forum> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Forum> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Forum> boolean exists(Example<S> example) {
                return false;
            }
        };
    }

    @Bean
    public QuotesRepository quotesRepository() {
        return new QuotesRepository() {
            @Override
            public Optional<Quotes> getQuoteById(Long id) {
                return Optional.empty();
            }

            @Override
            public List<Quotes> findAll() {
                return null;
            }

            @Override
            public List<Quotes> findAll(Sort sort) {
                return null;
            }

            @Override
            public List<Quotes> findAllById(Iterable<Long> longs) {
                return null;
            }

            @Override
            public <S extends Quotes> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Quotes> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Quotes> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Quotes> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Long> longs) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Quotes getOne(Long aLong) {
                return null;
            }

            @Override
            public Quotes getById(Long aLong) {
                return null;
            }

            @Override
            public <S extends Quotes> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Quotes> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<Quotes> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Quotes> S save(S entity) {
                return null;
            }

            @Override
            public Optional<Quotes> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Long aLong) {

            }

            @Override
            public void delete(Quotes entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Long> longs) {

            }

            @Override
            public void deleteAll(Iterable<? extends Quotes> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends Quotes> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Quotes> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Quotes> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Quotes> boolean exists(Example<S> example) {
                return false;
            }
        };
    }

    @Bean
    public TradeRepository tradeRepository() {
        return new TradeRepository() {
            @Override
            public Optional<Trade> getTradeById(Long id) {
                return Optional.empty();
            }

            @Override
            public Optional<List<Trade>> getUsersBookToTrade(Long userId) {
                return Optional.empty();
            }

            @Override
            public Optional<List<Trade>> getAvailableBooksToTrade(Long userId) {
                return Optional.empty();
            }

            @Override
            public Optional<Trade> getTradeByUser(Long userId, Long bookId) {
                return Optional.empty();
            }

            @Override
            public List<Trade> findAll() {
                return null;
            }

            @Override
            public List<Trade> findAll(Sort sort) {
                return null;
            }

            @Override
            public List<Trade> findAllById(Iterable<Long> longs) {
                return null;
            }

            @Override
            public <S extends Trade> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Trade> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Trade> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Trade> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Long> longs) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Trade getOne(Long aLong) {
                return null;
            }

            @Override
            public Trade getById(Long aLong) {
                return null;
            }

            @Override
            public <S extends Trade> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Trade> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<Trade> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Trade> S save(S entity) {
                return null;
            }

            @Override
            public Optional<Trade> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Long aLong) {

            }

            @Override
            public void delete(Trade entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Long> longs) {

            }

            @Override
            public void deleteAll(Iterable<? extends Trade> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends Trade> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Trade> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Trade> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Trade> boolean exists(Example<S> example) {
                return false;
            }
        };
    }

    @Bean
    public MyUserDetailsService userDetailsServiceBean() {
        return new MyUserDetailsService();
    }

    @Bean
    public AuthenticationRequestFilter authenticationRequestFilterBean() {
        return new AuthenticationRequestFilter();
    }

    @Bean
    public PasswordEncoder passwordEncoderBean() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    private PasswordEncoder getPasswordEncoder(){
        return new PasswordEncoder() {

            @Override
            public boolean matches(CharSequence arg0, String arg1) {

                return arg0.toString().equals(arg1);
            }

            @Override
            public String encode(CharSequence charSeq) {

                return charSeq.toString();
            }
        };
    }
}