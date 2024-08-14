package Africa.LearnAfrica.Controller;


//import Africa.LearnAfrica.Entity.Sports; // Make sure this is the correct import
import Africa.LearnAfrica.Service.SportsService; // Make sure this is the correct import
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SportsController {

    @Autowired
    private SportsService sportsService;

    @GetMapping("/sports")
    public String getSports(Model model) {
        model.addAttribute("sportsList", sportsService.getAllSports());
        return "sports"; // Name of the sports template
    }
}
