package karlinski.jonathan.exemplogradle;

import karlinski.jonathan.exemplogradle.model.Pessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemplogradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemplogradleApplication.class, args);

		System.out.println("Hello Word SpringBOOT com Gradle");

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Jonathan");
		System.out.println(pessoa);
	}

}
