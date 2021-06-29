/**
 * Purpose : To implement methods to check first name, last name,email, mobile number and password
 *           -to provide service to controller
 *
 * @author Krunal Lad
 * @Since 29-06-2021
 */

package com.krunal.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationService {

    /**
     * Purpose : Check whether first name or last name entered is valid or not it should start with cap
     *           and should have minimum 3 chars
     *
     * @param name input from user
     * @return true if it is valid else false
     */
    public boolean checkName(String name) {

        //first letter should be cap and should have min 3 letters
        String regex = "^[A-Z][a-z]{2,}";
        Pattern p = Pattern.compile(regex);

        if (name == null) {
            return false;
        }

        Matcher m = p.matcher(name);

        return m.matches();

    }

    /**
     * Purpose : Checks whether email is valid email or not
     *
     * @param email input from user
     * @return true if email is valid else false
     */
    public boolean checkEmailAddress(String email){

        //Validating email id
        String regex = "^[\\\\w!#$%&'*+/=?`{|}~^-]+(?:\\\\.[\\\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9-]{1}|[a-zA-Z]{3,5})\\\\.)+[a-zA-Z]{2,3}";

        Pattern p = Pattern.compile(regex);

        if (email == null) {
            return false;
        }

        Matcher m = p.matcher(email);

        return m.matches();

    }

    /**
     * Purpose : To check whether mobile number is valid or not
     *
     * @param mNumber input from user
     * @return true if mobile number is valid else false
     */
    public boolean checkMobileNumber(String mNumber){

        /**
         * For India :
         * Begins with 0 or 91
         * Then contains 7,8 or 9
         * Then contains 9 digits
         */
        String regex = "(0|91)?[7-9][0-9]{9}";

        Pattern p = Pattern.compile(regex);

        if (mNumber == null) {
            return false;
        }

        Matcher m = p.matcher(mNumber);

        return m.matches();
    }


    /**
     * Purpose : Checks password contains minimum 8 characters
     * @param password
     * @return
     */
    public boolean checkPassword(String password){

        //Validating Password
        String regex = "^(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[a-z])(?=.*[A-Z]).{8,}$";

        Pattern p = Pattern.compile(regex);

        if (password == null) {
            return false;
        }

        Matcher m = p.matcher(password);

        return m.matches();
    }
}
