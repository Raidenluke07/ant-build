package com;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorld extends ActionSupport {
    private String username;
    private String password;
    private String comments;

    // Getters and Setters for form properties
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String execute() {
        // Log or process the form data here if needed
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Comments: " + comments);
        return SUCCESS;
    }
}
