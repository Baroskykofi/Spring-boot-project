package Africa.LearnAfrica.Repository;

import Africa.LearnAfrica.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
