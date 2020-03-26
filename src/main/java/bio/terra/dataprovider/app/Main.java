package bio.terra.dataprovider.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "bio.terra.dataprovider")
public class Main {
  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }
}
