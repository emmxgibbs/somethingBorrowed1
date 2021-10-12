package com.User;

import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserDao,Integer> {

//    @Query("SELECT u FROM com.User u WHERE u.email = ?1")
//    com.User findByEmail(String email);
////    List<com.User> findByEmail(String email);
//    void deleteByEmail(String email);

    UserDao findByUsername(String username);

}