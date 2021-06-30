/**
 * Purpose : To implement methods to check first name, last name,email, mobile number and password
 *           -to provide service to controller
 *
 * @author Krunal Lad
 * @Since 29-06-2021
 */

package com.krunal.service;

import com.krunal.controller.UserRegistrationException;
import com.krunal.model.UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationService {

    /**
     * Purpose : Check whether first name entered is valid or not it should start with cap
     *           and should have minimum 3 chars
     *           if not valid it is handled by exception
     *
     * @param name input from user
     * @return true if it is valid
     */
    public boolean checkFirstName(String name) throws UserRegistrationException{
        //first letter should be cap and should have min 3 letters
        String regex = "^[A-Z][a-z]{2,}";
        try {
            Pattern p = Pattern.compile(regex);
            if(name.isEmpty())
                throw new UserRegistrationException("Please enter valid First Name", UserRegistrationException.TypesOfException.INVALID_FIRST_NAME);

            Matcher m = p.matcher(name);
            return m.matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Please enter valid First Name", UserRegistrationException.TypesOfException.INVALID_FIRST_NAME);
        }
    }

    /**
     * Purpose : Check whether last name entered is valid or not it should start with cap
     *           and should have minimum 3 chars
     *           if not valid it is handled by exception
     *
     * @param name input from user
     * @return true if it is valid
     */
    public boolean checkLastName(String name) throws UserRegistrationException{
        //first letter should be cap and should have min 3 letters
        String regex = "^[A-Z][a-z]{2,}";
        try {
            Pattern p = Pattern.compile(regex);

            if(name.isEmpty())
                throw new UserRegistrationException("Please enter valid Last Name",UserRegistrationException.TypesOfException.INVALID_LAST_NAME);

            Matcher m = p.matcher(name);
            return m.matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Please enter valid Last Name", UserRegistrationException.TypesOfException.INVALID_LAST_NAME);
        }
    }

    /**
     * Purpose : Checks whether email is valid email or not
     *           if not valid it is handled by exception
     *
     * @param email input from user
     * @return true if email is valid
     */
    public boolean checkEmailAddress(String email) throws UserRegistrationException {

        //Validating email id
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9-]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}";

        try {
            Pattern p = Pattern.compile(regex);

            if(email.isEmpty())
                throw new UserRegistrationException("Enter Valid Email",UserRegistrationException.TypesOfException.INVALID_EMAIL);

            Matcher m = p.matcher(email);
            return m.matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Enter Valid Email",UserRegistrationException.TypesOfException.INVALID_EMAIL);
        }

    }

    /**
     * Purpose : To check whether mobile number is valid
     *           if not valid it will be handle via Exception
     *           if not valid it is handled by exception
     *
     * @param mNumber input from user
     * @return true if mobile number is valid
     */
    public boolean checkMobileNumber(String mNumber) throws UserRegistrationException {

        /**
         * For India :
         * Begins with 0 or 91
         * Then contains 7,8 or 9
         * Then contains 9 digits
         */
        String regex = "(0|91)?[7-9][0-9]{9}";
        try {
            Pattern p = Pattern.compile(regex);

            if(mNumber.isEmpty())
                throw new UserRegistrationException("Invalid Mobile Number",UserRegistrationException.TypesOfException.INVALID_MOBILE_NUMBER);

            Matcher m = p.matcher(mNumber);

            return m.matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Invalid Mobile Number",UserRegistrationException.TypesOfException.INVALID_MOBILE_NUMBER);
        }

    }


    /**
     * Purpose : Checks password contains minimum 8 characters,at least one lower case,
     *           at least one upper case,exactly one special symbol
     *           if not valid it is handled by exception
     *
     * @param password
     * @return true if valid
     */
    public boolean checkPassword(String password) throws UserRegistrationException{

        //Validating Password
        String regex = "^(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[a-z])(?=.*[A-Z]).{8,}$";
        try {
            Pattern p = Pattern.compile(regex);
            if(password.isEmpty())
                throw new UserRegistrationException("Enter Valid Password",UserRegistrationException.TypesOfException.INVALID_PASSWORD);

            Matcher m = p.matcher(password);
            return m.matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Enter Valid Password",UserRegistrationException.TypesOfException.INVALID_PASSWORD);
        }

    }

}
