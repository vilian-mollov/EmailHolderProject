package EmailHolder.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    // GET, POST, PUT, DELETE


    //localhost:8080
    @ResponseBody
    @GetMapping(value = "/home")
    public String home(){
        return  "<h1>Hello JAVA - Jedi</h1>";
    }

}
