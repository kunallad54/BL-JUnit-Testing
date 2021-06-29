/******************************************************************************************************
 *
 * Purpose :  User Registration
 *            - user will enter first name,last name,email,mobile number and password
 *            - will validate all inputs are satisfying the conditions or not
 *            - validating using Regex
 *
 * @author Krunal Lad
 * @Since 29-06-2021
 *
 ******************************************************************************************************/

package com.krunal.controller;

import com.krunal.model.UserRegistration;
import com.krunal.service.UserRegistrationService;
import com.krunal.util.Utility;

public class UserRegistrationMain {

    public static void main(String[] args) {

        UserRegistrationMain usr = new UserRegistrationMain();
        System.out.println("Welcome to User Registration Program");
        usr.userDetailsValidation();

    }

    /**
     * Purpose : To check user details are valid or not
     */
    public void userDetailsValidation() {

        UserRegistrationService userRegistrationService = new UserRegistrationService();
        UserRegistration model = Utility.userDetails();

        System.out.println("\nKindly Enter Your Details : ");

        if (userRegistrationService.checkName(model.getFirstName()))
            System.out.println("Valid First Name");
        else
            System.out.println("Invalid First Name");

        if (userRegistrationService.checkName(model.getLastName()))
            System.out.println("Valid Last Name");
        else
            System.out.println("Invalid Last Name");

        if (userRegistrationService.checkEmailAddress(model.getEmailAddress()))
            System.out.println("Valid Email Address");
        else
            System.out.println("Invalid Email Address");

        if (userRegistrationService.checkMobileNumber(model.getMobileNumber()))
            System.out.println("Valid Mobile Number");
        else
            System.out.println("Invalid Mobile Number");

        if (userRegistrationService.checkPassword(model.getPassword()))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");

    }
}
