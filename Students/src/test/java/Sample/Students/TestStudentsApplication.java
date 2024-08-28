package Sample.Students;

import org.springframework.boot.SpringApplication;

public class TestStudentsApplication {

	public static void main(String[] args) {
		SpringApplication.from(StudentApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
