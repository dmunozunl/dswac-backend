package unl.dswac.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ApiBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiBackEndApplication.class, args);
	}

}
