/**
 * Purpose : To test User Registration Program
 */
package com.krunal.controller;

import com.krunal.service.UserRegistrationService;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    /**
     * Purpose : To check when first name given properly should return true
     */
    UserRegistrationService userRegistrationService = new UserRegistrationService();
    @Test
    void givenFirstName_Proper_ShouldReturnTrue() {
        boolean result = userRegistrationService.checkName("Krunal");
        Assert.assertTrue(result);
    }

    /**
     * Purpose : To check when first name not given proper should return false
     */
    @Test
    void givenFirstName_NotProper_ShouldReturnFalse() {
        boolean result = userRegistrationService.checkName("runal");
        // will print true as first name is not proper
        Assert.assertFalse(result);
    }

    /**
     * Purpose : To check when last name given properly should return true
     */
    @Test
    void givenLastName_Proper_ShouldReturnTrue() {
        boolean result = userRegistrationService.checkName("Lad");
        Assert.assertTrue(result);
    }

    /**
     * Purpose : To check when last name not given proper should return false
     */
    @Test
    void givenLastName_NotProper_ShouldReturnFalse() {
        boolean result = userRegistrationService.checkName("lad");
        // will print true as first name is not proper
        Assert.assertFalse(result);
    }

    /**
     * Purpose : To check when mobile number given properly should return true
     */
    @Test
    void givenMobileNumber_Proper_ShouldReturnTrue() {
        boolean result = userRegistrationService.checkMobileNumber("919856458645");
        Assert.assertTrue(result);
    }

    /**
     * Purpose : To check when mobile number given improper should return false
     */
    @Test
    void givenMobileNumber_NotProper_ShouldReturnFalse() {
        boolean result = userRegistrationService.checkMobileNumber("9856458");

        // will give true value as mobile number is not proper
        Assert.assertFalse(result);
    }
}
