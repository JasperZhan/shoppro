package com.angpa.shoppro.auth.model;

import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotNull;

/**
 * @author Jasper Zhan
 * @date 2022年02月03日 19:29
 */

public class User {

    @NotNull
    private String email;

    @URL
    String a;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}
