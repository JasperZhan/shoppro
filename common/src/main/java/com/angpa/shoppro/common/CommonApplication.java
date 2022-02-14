package com.angpa.shoppro.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

/**
 * @author Jasper Zhan
 * @date 2022年02月02日 21:21
 */

@SpringBootApplication
public class CommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class, args);

    }

//    @RestController



}
