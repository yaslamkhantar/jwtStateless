package elmoukhantar.yass.jwtlatestdemonstration.repository;

import elmoukhantar.yass.jwtlatestdemonstration.entities.MyUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface MyUserRepo extends JpaRepository<MyUserEntity,Long> {
    Optional<MyUserEntity> findByUsername(String myUserRepo);
}
