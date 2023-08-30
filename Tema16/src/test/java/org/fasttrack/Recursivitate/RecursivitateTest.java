package org.fasttrack.Recursivitate;

import org.fasttrack.Tema16.Recursivitate.MainRecursivitate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RecursivitateTest {
    private MainRecursivitate recursivitate;

    @BeforeEach
    public void setup(){
        recursivitate = new MainRecursivitate();
    }

    @Test
    public void testSumOfNEvenNumbers(){
        int test1 = MainRecursivitate.sumOfFirstNEvenIntegers(5);
        Assertions.assertTrue(test1>0);
        Assertions.assertEquals(30, test1);
    }

    @Test
    public void testsumOfDigits(){
        int test2 = MainRecursivitate.sumOfDigits(123);
        Assertions.assertEquals(6, test2);
        //test pentru n<10
        int test3 = MainRecursivitate.sumOfDigits(9);
        Assertions.assertEquals(9, test3);
    }

    @Test
    public void testfinonacciArray(){
        int test4 = MainRecursivitate.finonacciArray(7);
        Assertions.assertEquals(13, test4);
        //test pentru n<2
        int test5 = MainRecursivitate.finonacciArray(1);
        Assertions.assertEquals(1, test5);
    }
}
