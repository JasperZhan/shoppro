package com.angpa.shoppro.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @author Jasper Zhan
 * @date 2022年02月02日 21:21
 */



@SpringBootApplication
@EnableDiscoveryClient
//@Import(com.angpa.shoppro.common.advice.ExceptionAdvice.class)

public class AuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }

}
