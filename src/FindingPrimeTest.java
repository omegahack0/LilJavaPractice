
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class FindingPrimeTest {
    Startup startupClass = new Startup();
    int kaprekarConstant = 6174;

    @Test
    public void testFindingFactorsCorrectForSix(){
        //Creating a version of the object we are expecting back
        LinkedList<Integer> factorsOfSix = new LinkedList<>();
        factorsOfSix.add(1);
        factorsOfSix.add(2);
        factorsOfSix.add(3);
        factorsOfSix.add(6);

        //mock the function call
        ArrayList<Integer> result = startupClass.findFactors(6);

        // Verify we are getting the correct values
        Assert.assertEquals(factorsOfSix, result);
    }

    @Test
    public void testFindingFactorsCorrectForSixty(){
        //Creating a version of the object we are expecting back
        LinkedList<Integer> factorsOfSix = new LinkedList<>();
        factorsOfSix.add(1);
        factorsOfSix.add(2);
        factorsOfSix.add(3);
        factorsOfSix.add(4);
        factorsOfSix.add(5);
        factorsOfSix.add(6);
        factorsOfSix.add(10);
        factorsOfSix.add(12);
        factorsOfSix.add(15);
        factorsOfSix.add(20);
        factorsOfSix.add(30);
        factorsOfSix.add(60);

        //mock the function call
        ArrayList<Integer> result = startupClass.findFactors(60);

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
        LinkedList<Integer> result = startupClass.findOddNumber(5);

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
        LinkedList<Integer> result = startupClass.findPrimeDigit(5);

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
        ArrayList<Integer> result = startupClass.findPerfectNumber(4);

        // Verify we are getting expected values
        Assert.assertEquals(result, perfectNumbers);
    }

    @Test
    public void testIsPerfectTrue(){
        //Creating a version of the object we are expecting back
        ArrayList<Integer> perfectNumberFactors = new ArrayList<>();
        perfectNumberFactors.add(1);
        perfectNumberFactors.add(2);
        perfectNumberFactors.add(3);
        perfectNumberFactors.add(6);

        //mock the function call
        boolean result = startupClass.isPerfect(perfectNumberFactors,6);

        // Verify we are getting expected values
        Assert.assertTrue(result);
    }

    @Test
    public void testIsPerfectFalse(){
        //Creating a version of the object we are expecting back
        ArrayList<Integer> perfectNumberFactors = new ArrayList<>();
        perfectNumberFactors.add(1);
        perfectNumberFactors.add(2);
        perfectNumberFactors.add(3);
        perfectNumberFactors.add(4);
        perfectNumberFactors.add(6);
        perfectNumberFactors.add(8);
        perfectNumberFactors.add(12);
        perfectNumberFactors.add(24);

        //mock the function call
        boolean result = startupClass.isPerfect(perfectNumberFactors,24);

        // Verify we are getting expected values
        Assert.assertFalse(result);
    }

    @Test
    public void testFindKaprikarsConstant(){
        Assert.assertEquals(kaprekarConstant,
                startupClass.findKaprekarConstant(1234));
    }



}
