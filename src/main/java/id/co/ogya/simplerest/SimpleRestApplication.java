package id.co.ogya.simplerest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@ComponentScan({"id.co.ogya.simplerest.*"})
public class SimpleRestApplication {
	public static void main(String[] args) {
		SpringApplication.run(SimpleRestApplication.class, args);
	}

}
