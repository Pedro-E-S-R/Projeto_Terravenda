package terravenda.com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import terravenda.com.example.entities.User;
import terravenda.com.example.repositories.IUserRepositories;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private IUserRepositories userRepositories;

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null,"Pedro","teste1@teste.com","999.999.999.99","123",true,true);
        User user2 = new User(null,"Maria","teste2@teste.com","999.999.999.99","123",true,true);


        userRepositories.saveAll(Arrays.asList(user1,user2));
    }
}
