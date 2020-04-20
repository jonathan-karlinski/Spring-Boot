package externalclasses;

import org.springframework.stereotype.Component;

/**
 * @author Jonathan Karlinski
 * @since 17/04/20
 * @version 1.0
 */
@Component
public class ClassJDBC {

    public ClassJDBC() {
        System.out.println("conexão JDBC");
    }

}
