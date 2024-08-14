package Africa.LearnAfrica.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Africa.LearnAfrica.Entity.Entertainment;
import Africa.LearnAfrica.Repository.EntertainmentRepository;

@Service
public class EntertainmentService {

    @Autowired
    private EntertainmentRepository entertainmentRepository;

    public byte[] getImageById(Long id) {
        Entertainment entertainment = entertainmentRepository.findById(id).orElse(null);
        return (entertainment != null) ? entertainment.getImage() : null;
    }

    public List<Entertainment> getAllEntertainment() {
        return entertainmentRepository.findAll();
    }
}
