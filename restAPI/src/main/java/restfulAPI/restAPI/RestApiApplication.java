package restfulAPI.restAPI;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext ;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(RestApiApplication.class, args);
		System.out.println("Let's inspect the beans provided by Spring Boot: ");
		String[] beanNames = cxt.getBeanDefinitionNames() ;
		Arrays.sort(beanNames) ;
		for (String beanName: beanNames) {
			System.out.println(beanName);
		}
		
	}

}
