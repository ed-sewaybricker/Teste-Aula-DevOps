package meusite.com.example.demo; // define o pacote ao qual a classe pertence

// importa a classe que possui o método que permite iniciar uma app SpringBoot
import org.springframework.boot.SpringApplication;
// importa a anotação que reúne várias configurações do SpringBoot
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
