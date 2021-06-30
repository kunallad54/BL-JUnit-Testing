/**
 * Purpose : To test User Registration Program and handle exceptions using customized exception
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
    public void givenFirstName_Proper_ShouldReturnTrue() throws UserRegistrationException {
        try {
            boolean result = userRegistrationService.checkFirstName("Krunal");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }

    }

    /**
     * Purpose : To check when first name not valid should handle exception using customized exception
     */
    @Test
    public void givenInvalid_FirstName_ShouldReturnFalse() throws UserRegistrationException{
        try {
            userRegistrationService.checkFirstName("runal");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.TypesOfException.INVALID_FIRST_NAME,e.type);
        }

    }

    /**
     * Purpose : To check when last name given properly should return true
     */
    @Test
    public void givenLastName_Proper_ShouldReturnTrue() throws UserRegistrationException{
        try {
            boolean result = userRegistrationService.checkLastName("Lad");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }

    }

    /**
     * Purpose : To check when last name not valid should handle exception using customized exception
     */
    @Test
    public void givenInvalid_LastName_ShouldHandleException() throws UserRegistrationException {
        try {
            userRegistrationService.checkLastName("lad");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.TypesOfException.INVALID_LAST_NAME,e.type);
        }

    }

    /**
     * Purpose : To check when mobile number given properly should return true
     */
    @Test
    public void givenMobileNumber_Proper_ShouldReturnTrue() throws UserRegistrationException {
        try {
            boolean result = userRegistrationService.checkMobileNumber("919856458645");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }

    }

    /**
     * Purpose : To check when mobile number is invalid should handle exceptions using customized exception
     */
    @Test
    public void givenInvalid_MobileNumber_ShouldHandleException() throws UserRegistrationException {
        try {
            userRegistrationService.checkMobileNumber("9856458");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.TypesOfException.INVALID_MOBILE_NUMBER,e.type);
        }


    }
}
