/**
 * Purpose : Refactor the Code to use Lambda Function to validate User Entry
 * - Use Lambda Function to validate First Name, Last Name, Email, Mobile, and
 * Password
 */

package com.krunal.service;

import com.krunal.controller.UserRegistrationException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImplementationUsingLambda {


    /**
     * Purpose : Using Lambda Function Check whether first name entered is valid or not
     *           it should start with cap
     *           and should have minimum 3 chars
     *           if not valid it is handled by exception
     *
     * @param firstName input from user
     * @return true if it is valid
     */
    public UserRegistrationServiceInterface firstNameValidation = (String firstName) -> {
        String regex = "^[A-Z][a-z]{2,}";
        try {
            Pattern p = Pattern.compile(regex);
            if (firstName.isEmpty())
                throw new UserRegistrationException("Please enter valid First Name", UserRegistrationException.TypesOfException.INVALID_FIRST_NAME);

            Matcher m = p.matcher(firstName);
            return m.matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Please enter valid First Name", UserRegistrationException.TypesOfException.INVALID_FIRST_NAME);
        }

    };

    /**
     * Purpose : Using Lambda Function Check whether last name entered is valid or not
     *           it should start with cap and should have minimum 3 chars
     *           if not valid it is handled by exception
     *
     * @param lastName input from user
     * @return true if it is valid
     */
    public UserRegistrationServiceInterface lastNameValidation = (String lastName) -> {
        String regex = "^[A-Z][a-z]{2,}";
        try {
            Pattern p = Pattern.compile(regex);

            if (lastName.isEmpty())
                throw new UserRegistrationException("Please enter valid Last Name", UserRegistrationException.TypesOfException.INVALID_LAST_NAME);

            Matcher m = p.matcher(lastName);
            return m.matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Please enter valid Last Name", UserRegistrationException.TypesOfException.INVALID_LAST_NAME);
        }
    };

    /**
     * Purpose : Using Lambda Function Checks whether email is valid email or not
     *           if not valid it is handled by exception
     *
     * @param email input from user
     * @return true if email is valid
     */
    public UserRegistrationServiceInterface emailValidation = (String email) -> {
        //Validating email id
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9-]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}";

        try {
            Pattern p = Pattern.compile(regex);

            if (email.isEmpty())
                throw new UserRegistrationException("Enter Valid Email", UserRegistrationException.TypesOfException.INVALID_EMAIL);

            Matcher m = p.matcher(email);
            return m.matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Enter Valid Email", UserRegistrationException.TypesOfException.INVALID_EMAIL);
        }
    };

    /**
     * Purpose : Using Lambda Function To check whether mobile number is valid
     *           if not valid it will be handle via Exception
     *           if not valid it is handled by exception
     *
     * @param mNumber input from user
     * @return true if mobile number is valid
     */
    public UserRegistrationServiceInterface mobileNumberValidation = (String mNumber) -> {

        /**
         * For India :
         * Begins with 0 or 91
         * Then contains 7,8 or 9
         * Then contains 9 digits
         */
        String regex = "(0|91)?[7-9][0-9]{9}";
        try {
            Pattern p = Pattern.compile(regex);

            if (mNumber.isEmpty())
                throw new UserRegistrationException("Invalid Mobile Number", UserRegistrationException.TypesOfException.INVALID_MOBILE_NUMBER);

            Matcher m = p.matcher(mNumber);

            return m.matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Invalid Mobile Number", UserRegistrationException.TypesOfException.INVALID_MOBILE_NUMBER);
        }
    };

    /**
     * Purpose : Using Lambda Function Checks password contains minimum 8 characters,
     *           at least one lower case, at least one upper case,exactly one special symbol
     *           if not valid it is handled by exception
     *
     * @param password
     * @return true if valid
     */
    public UserRegistrationServiceInterface passwordValidation = (String password) -> {
        //Validating Password
        String regex = "^(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[a-z])(?=.*[A-Z]).{8,}$";
        try {
            Pattern p = Pattern.compile(regex);
            if (password.isEmpty())
                throw new UserRegistrationException("Enter Valid Password", UserRegistrationException.TypesOfException.INVALID_PASSWORD);

            Matcher m = p.matcher(password);
            return m.matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Enter Valid Password", UserRegistrationException.TypesOfException.INVALID_PASSWORD);
        }

    };
}
