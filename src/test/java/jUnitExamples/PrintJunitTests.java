package jUnitExamples;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrintJunitTests {
    @Test
    public void firstPrintedTest() {
        System.out.println("first printed test");
    }

    @Test
    public void secondPrintedTest() {
        System.out.println("second printed test");
    }

    @Test
    public void thirdPrintedTest() {
        System.out.println("third printed test");
    }

    @Test
    public void fourthPrintedTest() {
        System.out.println("fourth printed test");
    }


    @Test
    @Ignore
    public void ignoredTest() {

        System.out.println(" I am ignored !");
    }
}
