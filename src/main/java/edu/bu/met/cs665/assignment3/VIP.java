/**
 * Name: Shahla Hassan
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/24/2023
 * File Name: VIP.java
 * Description: Creates a VIP Class to store the email template for VIP Customers
 */
package edu.bu.met.cs665.assignment3;

public class VIP implements Email{

    /** Generating Email Template **/
    public String generateEmail(){
        String email = "Email Template for VIP Customer Segment!";
        return email;
    }
}
