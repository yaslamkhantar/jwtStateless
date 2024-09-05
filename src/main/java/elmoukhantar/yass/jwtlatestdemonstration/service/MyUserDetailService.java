package elmoukhantar.yass.jwtlatestdemonstration.service;

import elmoukhantar.yass.jwtlatestdemonstration.entities.MyUserEntity;
import elmoukhantar.yass.jwtlatestdemonstration.repository.MyUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private MyUserRepo myUserRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      MyUserEntity myUserEntity= myUserRepo.findByUsername(username).get();
        return User.builder().username(myUserEntity.getUsername()).password(myUserEntity.getPassword())
                .roles(myUserEntity.getRoles().split(",")).build();

    }
}
