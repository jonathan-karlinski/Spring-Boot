package karlinski.jonathan.exemplohelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jonathan Karlinski
 * @since 15/04/20
 * @version 1.0
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Agora sim, vamo dale!";
    }


}
