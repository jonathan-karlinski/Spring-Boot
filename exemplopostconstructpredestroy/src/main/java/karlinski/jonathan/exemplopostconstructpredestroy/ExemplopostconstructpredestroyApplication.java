package karlinski.jonathan.exemplopostconstructpredestroy;

import karlinski.jonathan.exemplopostconstructpredestroy.dao.ClientDAO;
import karlinski.jonathan.exemplopostconstructpredestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Jonathan Karlinski
 * @since 18/04/20
 * @version 1.0
 */
@SpringBootApplication
public class ExemplopostconstructpredestroyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemplopostconstructpredestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);
		clientDAO.setClient(new Client("Jorge"));

		System.out.println("clientDAO: "+ clientDAO);
		System.out.println("objeto client dentro do DAO: "+clientDAO.getClient());

	}

}
