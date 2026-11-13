package com.spring.spring_rest.dto;

/**
 * Carries the name of an authorization role to register.
 */
public class AuthRoleRegisterDto {

    private String name;

    /**
     * Creates a role registration request.
     *
     * @param name the role name
     */
    public AuthRoleRegisterDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
