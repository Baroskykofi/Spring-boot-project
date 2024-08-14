package Africa.LearnAfrica.Controller;

import Africa.LearnAfrica.Service.CultureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CultureController {

    @Autowired
    private CultureService cultureService;

    @GetMapping("/culture")
    public String getCulture(Model model) {
        model.addAttribute("cultures", cultureService.getAllCulture());
        return "culture";
    }
}
