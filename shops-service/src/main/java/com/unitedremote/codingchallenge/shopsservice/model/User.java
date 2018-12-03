package com.unitedremote.codingchallenge.shopsservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * This class will hold the basic structure of a document in the <b>user</b> collection
 * @author Ayoub Khial
 * @version 1.0
 */
@Document(collection = "users")
public class User {

    @Id
    private String id;
    @Indexed(name = "user_email", unique = true)
    private String email;
    private String password;

    public User() { }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}