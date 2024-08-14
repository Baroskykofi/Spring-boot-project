package Africa.LearnAfrica.Service;

import Africa.LearnAfrica.Entity.Sports; // Make sure this is the correct import
import Africa.LearnAfrica.Repository.SportsRepository; // Make sure this is the correct import
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SportsService {

    @Autowired
    private SportsRepository sportsRepository;

    public List<Sports> getAllSports() {
        return sportsRepository.findAll();
    }

    public byte[] getImageById(Long id) {
        Sports sports = sportsRepository.findById(id).orElse(null);
        return (sports != null) ? sports.getImage() : null;
    }
}
