package com.baeldung.um.client;

import com.baeldung.um.persistence.model.Privilege;
import com.baeldung.um.persistence.model.Role;
import com.baeldung.um.persistence.model.User;
import com.google.common.collect.Sets;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

public class FixtureResourceFactory {

    private FixtureResourceFactory() {
        throw new AssertionError();
    }


    // user
    
    public static User createNewUser(final String name) {
        return createNewUser(name, randomAlphabetic(8));
    }

    public static User createNewUser() {
        return createNewUser(randomAlphabetic(8), randomAlphabetic(8));
    }

    public static User createNewUser(final String name, final String pass) {
        return new User(name, pass, Sets.<Role> newHashSet());
    }

    // role

    public static Role createNewRole() {
        return createNewRole(randomAlphabetic(8));
    }

    public static Role createNewRole(final String name) {
        return new Role(name, Sets.<Privilege> newHashSet());
    }

    // privilege

    public static Privilege createNewPrivilege() {
        return createNewPrivilege(randomAlphabetic(8));
    }

    public static Privilege createNewPrivilege(final String name) {
        return new Privilege(name);
    }

}
