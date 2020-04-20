package karlinski.jonathan.exemplodependencia;

import karlinski.jonathan.exemplodependencia.model.Cat;
import karlinski.jonathan.exemplodependencia.model.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Jonathan Karlinski
 * @since 18/04/20
 * @version 1.0
 */
@SpringBootApplication
public class ExemplodependenciaApplication {

	public static void main(String[] args) {


		ApplicationContext applicationContext = SpringApplication.run(ExemplodependenciaApplication.class, args);
		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();


	}

}
