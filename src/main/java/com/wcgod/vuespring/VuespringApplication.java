package com.wcgod.vuespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class VuespringApplication {

    public static void main(String[] args) {
        SpringApplication.run(VuespringApplication.class, args);
    }

}
