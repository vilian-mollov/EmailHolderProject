package EmailHolder.Controller;


import EmailHolder.entity.Email;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    // GET, POST, PUT, DELETE

    List<Email> emailsList;

    public HomeController() {
        this.emailsList = new ArrayList<>();
    }


    //localhost:8080
    @GetMapping("/")
    public ModelAndView home(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        modelAndView.addObject("emailsList", this.emailsList);
        return modelAndView;
    }

    @PostMapping
    public String add(Email email){
        this.emailsList.add(email);
        return "redirect:/";
    }


}
