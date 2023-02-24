/**
 * Name: Shahla Hassan
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/24/2023
 * File Name: BusinessCustomer.java
 * Description: Creates a BusinessCustomer Class to create an object for Business
 */
package edu.bu.met.cs665.assignment3;

public class BusinessCustomer  extends EmailGeneration{

    /** Creating object **/
    public Email emailCustomers(){
        return new Business();
    }
}
