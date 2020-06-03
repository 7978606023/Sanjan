package com.test.stream;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wbl.stream.BinaryExample;

public class BinaryTest {
	
	BinaryExample binaryoperators;
    
    @BeforeTest
    public void setUp() {
        binaryoperators = new BinaryExample();
    }
    @Test
    public void positive() {
       Integer actual = binaryoperators.additionTwoNum(2, 3);
       Integer expected = 5;
       Assert.assertEquals(actual, expected);
    }
    
    @Test
    public void negetive() {
       Integer actual = binaryoperators.additionTwoNum(-2, -3);
       Integer expected = -5;
       Assert.assertEquals(actual, expected);
    }
    
    @Test
    public void positiveNegetive() {
       Integer actual = binaryoperators.additionTwoNum(-2, 3);
       Integer expected = 1;
       Assert.assertEquals(actual, expected);
    }

    @Test
    public void zero() {
       Integer actual = binaryoperators.additionTwoNum(0, 0);
       Integer expected = 0;
       Assert.assertEquals(actual, expected);
    }
    
    @Test
    public void positiveZero() {
       Integer actual = binaryoperators.additionTwoNum(0, 3);
       Integer expected = 3;
       Assert.assertEquals(actual, expected);
    }

    @Test
    public void zeroNegetive() {
       Integer actual = binaryoperators.additionTwoNum(-2, 0);
       Integer expected = -2;
       Assert.assertEquals(actual, expected);
    }
   
}
