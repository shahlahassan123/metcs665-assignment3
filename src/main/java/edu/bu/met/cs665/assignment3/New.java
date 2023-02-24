/**
 * Name: Shahla Hassan
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/24/2023
 * File Name: New.java
 * Description: Creates a New Class to store the email template for New Customers
 */
package edu.bu.met.cs665.assignment3;

public class New  implements Email{

    /** Generating Email Template **/
    public String generateEmail(){
        String email = "Email Template for New Customer Segment!";
        return email;
    }
}
