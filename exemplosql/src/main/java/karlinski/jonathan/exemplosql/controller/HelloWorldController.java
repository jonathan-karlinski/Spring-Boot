package karlinski.jonathan.exemplosql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jonathan Karlinski
 * @since 23/04/2020 - 14:30
 * @version 1.0
 */
@RestController
public class HelloWorldController {


    @GetMapping("/")
    public String index() {
        return "Bem vindo ao Sistema";
    }
}
