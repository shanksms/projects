package cde.codeboje.springbootbook.commentstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//this annotation will ask spring boot to add spring mvc and jackson library
@RestController
@EnableTransactionManagement
public class CommentStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommentStoreApplication.class, args);

	}


	@RequestMapping("/")
	String home() {
		return "Hello World";
	}

}

