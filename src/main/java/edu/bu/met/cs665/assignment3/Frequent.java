/**
 * Name: Shahla Hassan
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/24/2023
 * File Name: Frequent.java
 * Description: Creates a Frequent Class to store the email template for Frequent Customers
 */
package edu.bu.met.cs665.assignment3;

public class Frequent implements  Email{

    /** Generating Email Template **/
    public String generateEmail(){
        String email = "Email Template for Frequent Customer Segment!";
        return email;
    }
}
