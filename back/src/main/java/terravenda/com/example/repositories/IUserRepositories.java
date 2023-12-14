package terravenda.com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.security.core.userdetails.UserDetails;
import terravenda.com.example.entities.User;

public interface IUserRepositories extends JpaRepository<User,Long> {

//    UserDetails findByEmail (String email);
}
