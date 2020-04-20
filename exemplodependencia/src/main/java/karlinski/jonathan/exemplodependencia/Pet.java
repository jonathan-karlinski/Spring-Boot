package karlinski.jonathan.exemplodependencia;

import karlinski.jonathan.exemplodependencia.interfaces.IAnimal;
import karlinski.jonathan.exemplodependencia.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Jonathan Karlinski
 * @since 18/04/20
 * @version 1.0
 */
@Component
public class Pet {

    @Autowired
    @Qualifier("cat")
    private IAnimal iAnimal;


    public void execute() {
        iAnimal.comunicar();
    }



}
