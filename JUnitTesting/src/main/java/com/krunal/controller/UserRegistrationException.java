/**
 * Purpose : Creating Customized Exception Handling class to handle exceptions for all methods
 *           in UserRegistration Program
 *
 */
package com.krunal.controller;

public class UserRegistrationException extends Exception {
    public TypesOfException type;

    public enum TypesOfException{
        INVALID_FIRST_NAME,INVALID_LAST_NAME,
        INVALID_MOBILE_NUMBER,INVALID_EMAIL,
        INVALID_PASSWORD
    }

    // constructor
    public UserRegistrationException(String message,TypesOfException type) {
        super(message);
        this.type = type;
    }

}
