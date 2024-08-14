package Africa.LearnAfrica.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Africa.LearnAfrica.Entity.Culture;
import Africa.LearnAfrica.Repository.CultureRepository;

import java.util.List;

@Service
public class CultureService {

    @Autowired
    private CultureRepository cultureRepository;

    public List<Culture> getAllCulture() {
        return cultureRepository.findAll();
    }
}
