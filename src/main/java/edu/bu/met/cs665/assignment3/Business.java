/**
 * Name: Shahla Hassan
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/24/2023
 * File Name: Business.java
 * Description: Creates a Business Class to store the email template for Business Customers
 */
package edu.bu.met.cs665.assignment3;

public class Business implements Email{

    /** Generating Email Template **/
    public String generateEmail(){
        String email = "Email Template for Business Customer Segment!";
        return email;
    }
}
