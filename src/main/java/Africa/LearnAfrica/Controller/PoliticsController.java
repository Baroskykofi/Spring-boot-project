package Africa.LearnAfrica.Controller;


import Africa.LearnAfrica.Service.PoliticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PoliticsController {

    @Autowired
    private PoliticsService politicsService;

    @GetMapping("/politics")
    public String getPolitics(Model model) {
        model.addAttribute("politicsList", politicsService.getAllPolitics());
        return "politics";
    }
}
