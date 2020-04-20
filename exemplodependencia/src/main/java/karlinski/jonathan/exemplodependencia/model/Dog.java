package karlinski.jonathan.exemplodependencia.model;

import karlinski.jonathan.exemplodependencia.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Jonathan Karlinski
 * @since 18/04/20
 * @version 1.0
 */
@Component
@Qualifier("dog")
public class Dog  implements IAnimal {

    @Override
    public void comunicar() {
        System.out.println("Auuuuu");
    }
}
