/**
 * Name: Shahla Hassan
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/24/2023
 * File Name: ReturningCustomer.java
 * Description: Creates a ReturningCsutomer Class to create an object for Returning
 */
package edu.bu.met.cs665.assignment3;

public class ReturningCustomer extends EmailGeneration{

    /** Creating object **/
    public Email emailCustomers(){
        return new Returning();
    }
}
