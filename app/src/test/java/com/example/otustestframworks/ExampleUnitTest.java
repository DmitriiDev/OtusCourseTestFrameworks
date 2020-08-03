package com.example.otustestframworks;

//import org.junit.Test;
import org.testng.*;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    MathFunctions mathFuncProvider = new MathFunctions();

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void plusFuncTest() {
       double result = mathFuncProvider.plusFunc(3,2,'-');
        assertEquals(1.0, result, result);
    }

    @Test
    public void devideFuncTests() {
        double result = mathFuncProvider.plusFunc(3,2,'/');
        assertNotEquals(-1, result, result);
    }
}

