package com.spring.spring_rest.dto;

/**
 * Carries a username and password submitted for authentication.
 */
public class AuthLoginDto {

    private String username;
    private String password;

    /**
     * Creates a login request.
     *
     * @param username the account username
     * @param password the account password
     */
    public AuthLoginDto(String username, String password) {
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
