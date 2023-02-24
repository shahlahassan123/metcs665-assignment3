/**
 * Name: Shahla Hassan
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/24/2023
 * File Name: Returning.java
 * Description: Creates a Returning Class to store the email template for Returning Customers
 */
package edu.bu.met.cs665.assignment3;

public class Returning implements Email{

    /** Generating Email Template **/
    public String generateEmail(){
        String email = "Email Template for Returning Customer Segment!";
        return email;
    }
}
