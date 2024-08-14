package Africa.LearnAfrica.Service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import Africa.LearnAfrica.Entity.Entertainment;
import Africa.LearnAfrica.Entity.Sports;
import Africa.LearnAfrica.Entity.Politics;
import Africa.LearnAfrica.Entity.Culture; // Import the Culture entity
import Africa.LearnAfrica.Repository.EntertainmentRepository;
import Africa.LearnAfrica.Repository.SportsRepository;
import Africa.LearnAfrica.Repository.PoliticsRepository; // Import the Politics repository
import Africa.LearnAfrica.Repository.CultureRepository; // Import the Culture repository

@Service
public class ImageService {

    @Autowired
    private EntertainmentRepository entertainmentRepository;

    @Autowired
    private SportsRepository sportsRepository;

    @Autowired
    private PoliticsRepository politicsRepository;

    @Autowired
    private CultureRepository cultureRepository; // Autowire the Culture repository

    public byte[] getImageById(String entity, Long id) {
        switch (entity.toLowerCase()) {
            case "entertainment":
                return getEntertainmentImage(id);
            case "sports":
                return getSportsImage(id);
            case "politics":
                return getPoliticsImage(id);
            case "culture":
                return getCultureImage(id);
            default:
                return null;
        }
    }

    private byte[] getEntertainmentImage(Long id) {
        Entertainment entertainment = entertainmentRepository.findById(id).orElse(null);
        return (entertainment != null) ? entertainment.getImage() : null;
    }

    private byte[] getSportsImage(Long id) {
        Sports sports = sportsRepository.findById(id).orElse(null);
        return (sports != null) ? sports.getImage() : null;
    }

    private byte[] getPoliticsImage(Long id) {
        Politics politics = politicsRepository.findById(id).orElse(null);
        return (politics != null) ? politics.getImage() : null;
    }

    private byte[] getCultureImage(Long id) {
        Culture culture = cultureRepository.findById(id).orElse(null);
        return (culture != null) ? culture.getImage() : null;
    }
}
