package uni.rostock.tripadvisor.tripadvisor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "uni.rostock.tripadvisor.tripadvisor.repository")
public class TripadvisorApplication {

    public static void main(String[] args) {
        SpringApplication.run(TripadvisorApplication.class, args);
    }

}
