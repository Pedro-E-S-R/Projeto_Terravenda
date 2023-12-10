package terravenda.com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import terravenda.com.example.entities.User;
import terravenda.com.example.repositories.IUserRepositories;

import java.util.List;
import java.util.Optional;

@Component
public class UserServices {

    @Autowired
    private IUserRepositories userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
    public User findById(long id){
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }
}
