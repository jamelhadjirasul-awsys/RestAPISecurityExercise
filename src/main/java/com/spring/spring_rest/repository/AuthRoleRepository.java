package com.spring.spring_rest.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.spring_rest.entity.Auth_Role;

/**
 * Provides persistence operations and name-based 
 * lookups for authentication roles.
 */
public interface AuthRoleRepository extends JpaRepository<Auth_Role, Long> {

    /**
     * Finds a role by its name.
     *
     * @param theName the role name to search for
     * @return the matching role, if present
     */
    Optional<Auth_Role> findByName(String theName);

    /**
     * Checks whether a role with the given name exists.
     *
     * @param theUsername the role name to check
     * @return {@code true} if a matching role exists
     */
    Boolean existsByName(String theUsername);
}
