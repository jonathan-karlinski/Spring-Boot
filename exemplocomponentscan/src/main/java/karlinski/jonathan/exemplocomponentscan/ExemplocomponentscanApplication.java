package karlinski.jonathan.exemplocomponentscan;

import externalclasses.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Jonathan Karlinski
 * @since 17/04/20
 * @version 1.0
 */
@SpringBootApplication
@ComponentScan("externalclasses")
public class ExemplocomponentscanApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemplocomponentscanApplication.class, args);

		ClassDAO objectDAO1 = applicationContext.getBean(ClassDAO.class);

		System.out.println("objeto DAO: "+ objectDAO1);
		System.out.println("objeto JDBC dentro do DAO: " + objectDAO1.getObjsectJDBC());

	}

}
