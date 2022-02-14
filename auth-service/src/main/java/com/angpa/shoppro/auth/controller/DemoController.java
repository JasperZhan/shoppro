package com.angpa.shoppro.auth.controller;

import com.angpa.shoppro.auth.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;

/**
 * @author Jasper Zhan
 * @date 2022年02月03日 20:05
 */
@RestController
public class DemoController {

    @PostMapping("/hello")
    public String hello (@Valid @RequestBody User user) {

        System.out.println(user.getEmail());
        System.out.println();
        return user.toString();
    }
}
