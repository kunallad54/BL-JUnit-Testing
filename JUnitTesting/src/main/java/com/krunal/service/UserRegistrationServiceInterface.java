/**
 * Purpose : to implement functional interface to use lambda functions
 */
package com.krunal.service;

import com.krunal.controller.UserRegistrationException;

@FunctionalInterface
public interface UserRegistrationServiceInterface<T> {

    boolean validateEntries(String value) throws UserRegistrationException;
}
