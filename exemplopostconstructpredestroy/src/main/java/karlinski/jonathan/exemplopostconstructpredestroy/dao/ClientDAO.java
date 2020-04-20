package karlinski.jonathan.exemplopostconstructpredestroy.dao;

import karlinski.jonathan.exemplopostconstructpredestroy.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Jonathan Karlinski
 * @since 18/04/20
 * @version 1.0
 */
@Component
@Getter @Setter
public class ClientDAO {

    @Autowired
    private Client client;


    @PostConstruct
    public void postConstruct() {
        System.out.println("objeto criado");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("objeto finalizado");
    }
}
