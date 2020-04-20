package karlinski.jonathan.exemploescopo;

import karlinski.jonathan.exemploescopo.dao.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Jonathan Karlinski
 * @since 18/04/20
 * @version 1.0
 */
@SpringBootApplication
public class ExemploescopoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploescopoApplication.class, args);

		ClassDAO classDAO1 = applicationContext.getBean(ClassDAO.class);
		ClassDAO classDAO2 = applicationContext.getBean(ClassDAO.class);

		System.out.println("objeto DAO: "+ classDAO1);
		System.out.println("objeto JDBC: "+classDAO1.getObjectJDBC());

		System.out.println("objeto DAO: "+ classDAO2);
		System.out.println("objeto JDBC: "+classDAO2.getObjectJDBC());
	}

}
