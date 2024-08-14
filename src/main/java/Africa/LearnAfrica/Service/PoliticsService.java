package Africa.LearnAfrica.Service;

import Africa.LearnAfrica.Entity.Politics;
import Africa.LearnAfrica.Repository.PoliticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoliticsService {

    @Autowired
    private PoliticsRepository politicsRepository;

    public List<Politics> getAllPolitics() {
        return politicsRepository.findAll();
    }
}
