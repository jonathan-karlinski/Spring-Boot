package karlinski.jonathan.exemplopostconstructpredestroy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author Jonathan Karlinski
 * @since 18/04/20
 * @version 1.0
 */
@Component
@Getter @Setter
@AllArgsConstructor
@ToString
public class Client {

    private String name;

    public Client() {
        System.out.println("Classe cliente");
    }
}
