package com.spring.spring_rest.dto;

/**
 * Carries the username and password for a new authentication user.
 */
public class AuthUserRegisterDto {

    private String username;
    private String password;

    /**
     * Creates a user registration request.
     *
     * @param username the account username
     * @param password the account password
     */
    public AuthUserRegisterDto(String username, String password) {
        this.username = username;
        this.password = password;
    }
   
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
}
