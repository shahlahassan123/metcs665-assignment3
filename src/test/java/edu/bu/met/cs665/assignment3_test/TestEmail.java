/**
 * Name: Shahla Hassan
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/24/2023
 * File Name: TestEmail.java
 * Description: Testing happens in this class
 */
package edu.bu.met.cs665.assignment3_test;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.assignment3.*;
import org.junit.Test;

public class TestEmail {

    /** Testing email template for Business Customers **/
    @Test
    public void TestBusiness(){
        EmailGeneration email = new BusinessCustomer();
        String actualResult = email.generateEmailRequest();
        String expectedResult = "Email Template for Business Customer Segment!";
        assertEquals(expectedResult, actualResult);
    }

    /** Testing email template for VIP Customers **/
    @Test
    public void TestVIP(){
        EmailGeneration email = new VIPCustomer();
        String actualResult = email.generateEmailRequest();
        String expectedResult = "Email Template for VIP Customer Segment!";
        assertEquals(expectedResult, actualResult);
    }

    /** Testing email template for Returning Customers **/
    @Test
    public void TestReturning(){
        EmailGeneration email = new ReturningCustomer();
        String actualResult = email.generateEmailRequest();
        String expectedResult = "Email Template for Returning Customer Segment!";
        assertEquals(expectedResult, actualResult);
    }

    /** Testing email template for Frequent Customers **/
    @Test
    public void TestFrequent(){
        EmailGeneration email = new FrequentCustomer();
        String actualResult = email.generateEmailRequest();
        String expectedResult = "Email Template for Frequent Customer Segment!";
        assertEquals(expectedResult, actualResult);
    }

    /** Testing email template for New Customers **/
    @Test
    public void TestNew(){
        EmailGeneration email = new NewCustomer();
        String actualResult = email.generateEmailRequest();
        String expectedResult = "Email Template for New Customer Segment!";
        assertEquals(expectedResult, actualResult);
    }





}
