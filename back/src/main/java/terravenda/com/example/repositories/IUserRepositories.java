package terravenda.com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import terravenda.com.example.entities.User;

public interface IUserRepositories extends JpaRepository<User,Long> {
}
