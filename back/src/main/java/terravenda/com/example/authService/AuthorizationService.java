//package terravenda.com.example.authService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import terravenda.com.example.repositories.IUserRepositories;
//
//@Service
//public class AuthorizationService implements UserDetailsService {
//
//    @Autowired
//    IUserRepositories userRepositories;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return userRepositories.findByEmail(username);
//    }
//}
