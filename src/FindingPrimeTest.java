
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class FindingPrimeTest {

    @Test
    public void testFindingFactorsCorrectForSix(){
        //Creating a version of the object we are expecting back
        LinkedList<Integer> factorsOfSix = new LinkedList<>();
        factorsOfSix.add(1);
        factorsOfSix.add(2);
        factorsOfSix.add(3);
        factorsOfSix.add(6);

        //mock the function call
        LinkedList<Integer> result = main.findFactors(6);

        // Verify we are getting the correct values
        Assert.assertEquals(factorsOfSix, result);
    }

    @Test
    public void testFindOddNumber(){
        //Creating a version of the object we are expecting back
        LinkedList<Integer> oddNumbers = new LinkedList<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        oddNumbers.add(7);
        oddNumbers.add(9);

        //mock the function call
        LinkedList<Integer> result = main.findOddNumber(5);

        // Verify we are getting expected values
        Assert.assertEquals(oddNumbers, result);
    }

    @Test
    public void testFindPrimeDigit(){
        //Creating a version of the object we are expecting back
        LinkedList<Integer> primeNumbers = new LinkedList<>();
        primeNumbers.add(1);
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(7);

        //mock the function call
        LinkedList<Integer> result = main.findPrimeDigit(5);

        // Verify we are getting expected values
        Assert.assertEquals(primeNumbers, result);
    }

    @Test
    public void testFindPerfectNumber(){
        //Creating a version of the object we are expecting back
        LinkedList<Integer> perfectNumbers = new LinkedList<>();
        perfectNumbers.add(6);
        perfectNumbers.add(28);
        perfectNumbers.add(496);
        perfectNumbers.add(8128);

        //mock the function call
        LinkedList<Integer> result = main.findPerfectNumber(4);

        // Verify we are getting expected values
        Assert.assertEquals(result, perfectNumbers);
    }

    @Test
    public void testIsPerfectTrue(){
        //Creating a version of the object we are expecting back
        LinkedList<Integer> perfectNumberFactors = new LinkedList<>();
        perfectNumberFactors.add(1);
        perfectNumberFactors.add(2);
        perfectNumberFactors.add(3);
        perfectNumberFactors.add(6);

        //mock the function call
        boolean result = main.isPerfect(perfectNumberFactors,6);

        // Verify we are getting expected values
        Assert.assertTrue(result);
    }

    @Test
    public void testIsPerfectFalse(){
        //Creating a version of the object we are expecting back
        LinkedList<Integer> perfectNumberFactors = new LinkedList<>();
        perfectNumberFactors.add(1);
        perfectNumberFactors.add(2);
        perfectNumberFactors.add(3);
        perfectNumberFactors.add(4);
        perfectNumberFactors.add(6);
        perfectNumberFactors.add(8);
        perfectNumberFactors.add(12);
        perfectNumberFactors.add(24);

        //mock the function call
        boolean result = main.isPerfect(perfectNumberFactors,24);

        // Verify we are getting expected values
        Assert.assertFalse(result);
    }

    @Test
    public void testFindKaprikarsConstant(){
        Assert.assertEquals(6174,main.findKapricoreConstant(1234));
    }



}
