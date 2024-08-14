package Africa.LearnAfrica.Repository;



import Africa.LearnAfrica.Entity.Sports; // Make sure this is the correct import
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportsRepository extends JpaRepository<Sports, Long> {
}
