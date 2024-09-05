package elmoukhantar.yass.jwtlatestdemonstration;

import elmoukhantar.yass.jwtlatestdemonstration.entities.MyUserEntity;
import elmoukhantar.yass.jwtlatestdemonstration.repository.MyUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class JwtlatestdemonstrationApplication {

    @Autowired
    private MyUserRepo myUserRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(JwtlatestdemonstrationApplication.class, args);
    }
@Bean
    CommandLineRunner start(){
        return args -> {
            MyUserEntity user1=new MyUserEntity();
            user1.setUsername("yassine");
            user1.setPassword(passwordEncoder.encode("lamkhantar"));
            user1.setRoles("ADMIN");
            MyUserEntity user2=new MyUserEntity();
            user2.setUsername("hajar");
            user2.setPassword("{noop}hachim");
            user2.setRoles("USER");
            myUserRepo.save(user1);
            myUserRepo.save(user2);
        };
    }

}
