package com.myfirstproject;

import org.junit.*;

public class Day02_FirstJUnitClass {

    /*
          JUNIT is a testing framework
          Junit is one of the oldest java testing framework
          TESTING ALSO USE UNIT TESTING FOR CREATING AUTOMATION TEST FRAMEWORK
          Developers also use JUnit for their UNIT TESTING
          No more main method
     *****JUNIT has 7 major annotation
     1.   @Test annotation is used to create test cases
    NOTE: all test method will be void
          Because test methods are used for assertions
     2.   @Before : Runs before each @Test annotation
     3.   @After : Runs after each @Test annotation
     4.   @BeforeClass : Runs only one before each class
     5.   @AfterClass : Runs only once after each class
     6.   @Ignore : To skip a Test case

     *****JUNIT ASSERTION
          We use JUnit assertion if actual and expected is equal
          Instead of using if else statement, we will use JUnit assertions
          It will come from Assert class
     1.   Assert.assertEquals("ACTUAL","EXPECTED");
     2.   Assert.assertTrue("ACTUAL".contains("EXPECTED"));
     3.   Assert.assertFalse("ACTUAL".contains("EXPECTED"));
     */

    @Before
    public void setUp(){
        System.out.println("This is Before method");
    }

    @Test
    public void test1(){
        System.out.println("Test1");
    }

    //creating a new test case
    @Test
    public void test2() {
        System.out.println("Test 2");
    }

    @Ignore
    @Test
    public void test03(){
        System.out.println("Test3");
    }

    @Test
    public void test3() {
        System.out.println("Test 3");
    }

    @Test
    public void test4() {
        System.out.println("Test 4");
    }

    @After
    public void tearDown(){
        System.out.println("This is TEAR DOWN method");
    }

    //ASSERTION
    //if expected == actual

    @Test
    public void assertions(){
        //1. Assert.assertEquals("expected","actual");
        //If assertion fails, thane we see error message on the console
        //If assertion pass, then we see a green checkmark only
          Assert.assertEquals("javascript","java");

        //2. Assert.assertTrue(BOOLEAN);
          Assert.assertTrue("Selenium".contains("e"));

        //3. Assert.assertFalse(BOOLEAN);
          Assert.assertFalse("Selenium".contains("java"));// "Selenium".contains("a") -> FALSE

        //We can add a massage as well.
        //This message will ONLY DISPLAY WHEN ASSERTION FAILS!!!
          Assert.assertEquals("OHH NOO!","java","javascript");
    }
}

