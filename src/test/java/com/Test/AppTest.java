package com.Test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest 
    extends TestCase
{
   
   @org.junit.Test
     public void testApp()
    {
        assertTrue( App.isEven(24));
    }
}
