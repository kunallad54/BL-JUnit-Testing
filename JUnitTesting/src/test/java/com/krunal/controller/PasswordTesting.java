/**
 * Purpose : To test Password  validation conditions
 */
package com.krunal.controller;

import com.krunal.service.UserRegistrationService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PasswordTesting {

    public String password;
    public boolean expectedResult;

    public PasswordTesting(String password,boolean expectedResult) {
        this.password = password;
        this.expectedResult = expectedResult;
    }


    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][] {
                { "Say%1234", true } ,      //at least 1 uppercase, at least 1 numeric value, exactly 1 special character, minimum length is 8
                { "Say%123", false } ,      // minimum length is not 8
                { "say%1234", false } ,     // does not have at least 1 upper case value
                { "aAy%abc", false } ,      // does not have at least 1 numeric value
                { "sAy%#1234", false } ,    // does not have exact 1 special character
        } );
    }

    /**
     * Purpose : To test checkPassword method and  exception handling
     * @throws UserRegistrationException
     */
    @Test
    public void givenPassword_WithMinimum8Characters_ShouldReturnTrue() throws UserRegistrationException {
        try {
            UserRegistrationService userRegistrationService = new UserRegistrationService();
            userRegistrationService.checkPassword(password);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.TypesOfException.INVALID_PASSWORD,e.type);
        }


    }


}

