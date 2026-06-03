package unicesumar.lol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import unicesumar.lol.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    UserDetails findByLogin(String role);
}