package com.spring.spring_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.spring_rest.entity.Auth_User;
import java.util.Optional;

/**
 * Provides persistence operations and username-based lookups 
 * for authentication users.
 */
public interface AuthUserRepository extends JpaRepository<Auth_User, Long> {

    /**
     * Finds a user by username.
     *
     * @param theUsername the username to search for
     * @return the matching user, if present
     */
    Optional<Auth_User> findByUsername(String theUsername);

    /**
     * Checks whether a user with the given username exists.
     *
     * @param theUsername the username to check
     * @return {@code true} if a matching user exists
     */
    Boolean existsByUsername(String theUsername);
}
