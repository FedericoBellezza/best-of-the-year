package org.lessons.java.best_of_the_year;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/")
public class controller {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Federico" );
        return "home";
    }
    
    
}
