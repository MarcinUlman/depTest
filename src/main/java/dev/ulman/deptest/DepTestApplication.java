package dev.ulman.deptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "dev.ulman")
public class DepTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepTestApplication.class, args);
    }

}
