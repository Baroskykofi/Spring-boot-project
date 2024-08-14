package Africa.LearnAfrica.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard"; // Name of the dashboard template
    }

    // Make sure to change the mapping if needed
    @GetMapping("/dashboard/entertainment")
    public String entertainment(Model model) {
        // Logic to get entertainment data
        return "entertainment"; // Name of the entertainment template
    }

    @GetMapping("/dashboard/sports")
    public String getSports(Model model) {
        return "sports"; // Name of the sports template
    }
}
