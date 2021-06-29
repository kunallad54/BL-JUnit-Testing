/**
 * Purpose : To provide user console and set all data
 *
 * @author Krunal Lad
 * @Since 29-06-2021
 */
package com.krunal.util;

import com.krunal.model.UserRegistration;

import java.util.Scanner;

public class Utility {
    static UserRegistration model = new UserRegistration();

    static Scanner scanner = new Scanner(System.in);

    public static UserRegistration userDetails(){
        System.out.println("Enter First Name : ");
        String firstName = scanner.next();
        model.setFirstName(firstName);

        System.out.println("Enter Last Name : ");
        String lastName = scanner.next();
        model.setLastName(lastName);

        System.out.println("Enter the Email Address : ");
        String emailAddress = scanner.next();
        model.setEmailAddress(emailAddress);

        System.out.println("Enter the Mobile Number : ");
        String mobileNumber = scanner.next();
        model.setMobileNumber(mobileNumber);

        System.out.println("Enter the Password : ");
        String password = scanner.next();
        model.setPassword(password);

        return model;
    }
}
