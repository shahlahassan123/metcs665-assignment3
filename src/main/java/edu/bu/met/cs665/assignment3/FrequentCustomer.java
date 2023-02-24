/**
 * Name: Shahla Hassan
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/24/2023
 * File Name: FrequentCustomer.java
 * Description: Creates a Frequent Customer Class to create an object for Frequent
 */
package edu.bu.met.cs665.assignment3;

public class FrequentCustomer extends EmailGeneration {

    /** Creating object **/
    public Email emailCustomers(){
        return new Frequent();
    }
}
