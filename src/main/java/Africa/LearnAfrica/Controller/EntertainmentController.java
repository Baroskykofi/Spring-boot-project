package Africa.LearnAfrica.Controller;

import Africa.LearnAfrica.Service.EntertainmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EntertainmentController {

    @Autowired
    private EntertainmentService entertainmentService;

    @GetMapping("/entertainment")
    public String getEntertainment(Model model) {
        model.addAttribute("entertainments", entertainmentService.getAllEntertainment());
        return "entertainment"; // Name of the entertainment template
    }
}
