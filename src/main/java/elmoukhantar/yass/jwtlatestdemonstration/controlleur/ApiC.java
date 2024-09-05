package elmoukhantar.yass.jwtlatestdemonstration.controlleur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiC {
    @GetMapping("/apii")
    public String hello(){
        return "aaaaaa";

    }
    @GetMapping("/hello2")
    public String hello2(){
        return "aaaaaa";

    }
}
