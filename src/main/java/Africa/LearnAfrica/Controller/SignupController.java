package Africa.LearnAfrica.Controller;

import Africa.LearnAfrica.Entity.User;
import Africa.LearnAfrica.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;  // Use PasswordEncoder instead of BCryptPasswordEncoder

    @GetMapping("/signup")
    public String showSignupForm() {
        return "signup"; // This returns the signup.html template
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute User user, @ModelAttribute("confirmPassword") String confirmPassword) {
        // Check if passwords match
        if (!user.getPassword().equals(confirmPassword)) {
            // Handle error - Passwords do not match
            return "redirect:/signup?error";
        }

        // Hash the password
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // Save the user to the database
        userRepository.save(user);

        
        // Debugging: Log the user object before saving
        System.out.println("User Data: " + user);
        

        // Redirect to the login page
        return "redirect:/login";
    }

  

 


   
    

   
}
