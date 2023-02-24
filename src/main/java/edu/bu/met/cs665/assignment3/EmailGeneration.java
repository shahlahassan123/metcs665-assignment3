/**
 * Name: Shahla Hassan
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/24/2023
 * File Name: EmailGeneration.java
 * Description: This is a factory method class where the creation of different objects take place
 */
package edu.bu.met.cs665.assignment3;

public abstract class EmailGeneration {

    /** Creating objects and generating the email template**/
    public String generateEmailRequest(){
        Email email = emailCustomers();
        String result = email.generateEmail();
        return result;
    }

    /** Creating different objects **/
    public abstract Email emailCustomers();
}
