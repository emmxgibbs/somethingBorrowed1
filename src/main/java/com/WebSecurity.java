package com;

import com.Authentication.AuthenticationRequestFilter;
import com.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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

@EnableGlobalMethodSecurity(prePostEnabled=true)
@EnableWebSecurity
@EnableJpaRepositories(basePackageClasses= UserRepository.class)
@Configuration
public class WebSecurity extends WebSecurityConfigurerAdapter{

    @Autowired
    MyUserDetailsService userDetailsService;

    protected void configure(AuthenticationManagerBuilder auth) throws Exception{

        auth.userDetailsService(userDetailsService)
                .passwordEncoder(getPasswordEncoder());
    }

    @Autowired
    private AuthenticationRequestFilter jwtRequestFilter;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailsService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests()
                .antMatchers("**/secure/**").authenticated()
                .anyRequest().permitAll()
                .and().formLogin().loginPage("/login").successForwardUrl("/rest/secured/loginSuccess").permitAll()
                .and().logout().logoutSuccessUrl("/login?logout");

        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/html/**", "/images/**", "/css/**", "/js/**", "/font/**", "/img/**", "/ExerciseImg/**").permitAll()
                .antMatchers("/authenticate", "/register", "/home", "/login", "/search", "/trade", "/somethingBorrowed/book", "/somethingBorrowed/forum").permitAll()
                .anyRequest().authenticated()
                .and().sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
    }
                .antMatchers("/html/**", "/images/**", "/css/**", "/js/**", "/font/**","/favicon.ico","/img/**","/ExerciseImg/**").permitAll()
                .antMatchers("/authenticate", "/register", "/home", "/login", "/console","/createRoutine", "/comment","/showcomments","/addComment","/countdown",
                            "/getClientList","/search","/uploadFile","/deleteFile",
                            "/multipleImageUpload","/imageUpload",
                            "/uploadImg","/uploadImgAjax","/uploadImgDuo",
                            "/doExercise", "/goExercise",
                            "/details","/DetailsInfo","/updateInfo","/addDetails",
                            "/showDetails","/completeDetails","/viewComment").permitAll()
                    .anyRequest().authenticated()
                    .and().sessionManagement()
                    .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
            http.addFilterBefore(authenticationRequestFilter, UsernamePasswordAuthenticationFilter.class);
        }

    @Bean
    public PasswordEncoder passwordEncoder() {
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