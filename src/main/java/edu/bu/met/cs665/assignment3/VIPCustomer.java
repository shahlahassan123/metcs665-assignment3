/**
 * Name: Shahla Hassan
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/24/2023
 * File Name: VIPCustomer.java
 * Description: Creates a VIPCustomer Class to create an object for VIP
 */
package edu.bu.met.cs665.assignment3;

public class VIPCustomer extends EmailGeneration{

    /** Creating object **/
    public Email emailCustomers(){
        return new VIP();
    }

}
