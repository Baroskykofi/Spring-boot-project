package Africa.LearnAfrica.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Africa.LearnAfrica.Entity.Entertainment;

public interface EntertainmentRepository extends JpaRepository<Entertainment, Long> {
}
