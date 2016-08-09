package nl.sparkle.flywaydemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(App.class, args);
		
		System.out.println("Let's inspect the beans provided by Spring Boot:");
		
		List<String> beanNames = Arrays.asList(ctx.getBeanDefinitionNames());
		
		System.out.println("======================================================================================");
		
		beanNames.stream()
			.sorted()
			.forEach(System.out::println);
	}

}
