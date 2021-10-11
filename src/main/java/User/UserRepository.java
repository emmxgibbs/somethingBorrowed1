package User;

import User.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.*;

import java.util.List;

public interface UserRepository extends CrudRepository<UserDao,Integer> {

//    @Query("SELECT u FROM User u WHERE u.email = ?1")
//    User findByEmail(String email);
////    List<User> findByEmail(String email);
//    void deleteByEmail(String email);

    UserDao findByUsername(String username);

}