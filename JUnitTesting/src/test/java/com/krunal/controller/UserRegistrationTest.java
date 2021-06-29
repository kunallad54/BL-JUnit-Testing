/**
 * Purpose : To test User Registration Program
 */
package com.krunal.controller;

import com.krunal.service.UserRegistrationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    /**
     * Purpose : To check when first name given properly should return true
     */
    UserRegistrationService userRegistrationService = new UserRegistrationService();
    @Test
    void givenFirstName_Proper_ShouldReturnTrue() {
        boolean result = userRegistrationService.checkName("Krunal");
        Assertions.assertTrue(result);
    }

    /**
     * Purpose : To check when first name not given proper should return false
     */
    @Test
    void givenFirstName_NotProper_ShouldReturnFalse() {
        boolean result = userRegistrationService.checkName("runal");
        // will print true as first name is not proper
        Assertions.assertFalse(result);
    }

    /**
     * Purpose : To check when last name given properly should return true
     */
    @Test
    void givenLastName_Proper_ShouldReturnTrue() {
        boolean result = userRegistrationService.checkName("Lad");
        Assertions.assertTrue(result);
    }

    /**
     * Purpose : To check when last name not given proper should return false
     */
    @Test
    void givenLastName_NotProper_ShouldReturnFalse() {
        boolean result = userRegistrationService.checkName("lad");
        // will print true as first name is not proper
        Assertions.assertFalse(result);
    }

}
