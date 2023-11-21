package springbootstarterweb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		MessageProxy m1 = new MessageProxy("hello");
		m1.print();
	}

}
