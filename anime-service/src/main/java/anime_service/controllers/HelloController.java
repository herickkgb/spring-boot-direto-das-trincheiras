package anime_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
        @GetMapping(value ={"hi"} )
        public String hi(){
            return "OMAE WA MOU SHINDE IRU";
        }
}
