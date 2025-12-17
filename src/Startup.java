import java.util.ArrayList;
import java.util.LinkedList;

//TODO play with setting up/sorting an arraylist
    //Chosing Arraylist because it appears to be be the best of both worlds, better than LL or Array
//TODO mess with java streams/filters
//TODO Refactor to se arraylist instead of LL
//TODO use either int or Integer but not both
//TODO not everything should be a static context -- I think its fine in this instance though
    //Rule of thumb
    //If its not a utility class or it needs No access to instance data it shouldn't be static
    //https://stackoverflow.com/questions/2671496/when-to-use-static-methods
    //Static means that the method or variable does not belong to any instance of the class but rather to the class itself. You use it if, and only if, you need a method or variable to be wholly decoupled from the objects of the class, such as for global variables or some utility methods. Such a situation isn't normally that common, which is why you don't normally use the static keyword that often.


class Startup {
    public static void main(String[] args) {
        Startup startClass = new Startup();
        System.out.println("Amount of Odd Numbers");
        System.out.println(startClass.findOddNumber(1000));
        System.out.println("Find Prime Numbers");
        System.out.println(startClass.findPrimeDigit(1000));
        System.out.println("Find Perfect Numbers");
        System.out.println(startClass.findPerfectNumber(10));
        System.out.println("Find Kapricore Constant");
        System.out.println(startClass.findKaprekarConstant(0124));

    }

    public LinkedList<Integer> findOddNumber(int amountOfOddNumbers){
        LinkedList<Integer> OddNumbers = new LinkedList<>();
        int i = 0;
        while(amountOfOddNumbers > OddNumbers.size()){
            if(i % 2 == 1){
                //Modulus Operator Explanation
                //https://stackoverflow.com/questions/17524673/understanding-the-modulus-operator
                OddNumbers.add(i);
            }
            i++;
        }
        return OddNumbers;
    }

    public LinkedList<Integer> findPrimeDigit(int amountOfPrimeNumbers){
        LinkedList<Integer> PrimeNumbers = new LinkedList<>();
        int i = 0;
        while(amountOfPrimeNumbers > PrimeNumbers.size()){
            // Im pretty sure this will only return prime numbers but im sure it will fall apart at some point,
            // might want to implement integer factorization as an extra layer
            // https://en.wikipedia.org/wiki/Integer_factorization
            if((i % 2 >= 1 || i == 2) && (i % 3 >= 1 || i==3) && (i % 5 >= 1 || i == 5) && (i % 7 >= 1 || i == 7)){
                PrimeNumbers.add(i);
            }
            i++;
        }
        return PrimeNumbers;
    }

    public ArrayList<Integer> findPerfectNumber(int amountOfPerfectNumbers){
        //TODO SPEED UP finding more Perfect numbers because its dog slow
        ArrayList<Integer> PerfectNumbers = new ArrayList<>();
        int i = 1;
        while(amountOfPerfectNumbers > PerfectNumbers.size()){
            // Perfect Number - a number that adds up to all its
            // Pretty sure the easiest way to do this will to do the integer factorization, then to do the addition
            // 6 has proper divisors 1, 2 and 3, and 1 + 2 + 3 = 6, so 6 is a perfect number.

            if(isPerfect(findFactors(i),i))
                PerfectNumbers.add(i);

            i++;
        }
        return PerfectNumbers;
    }

    public ArrayList<Integer> findFactors(int numberToBeFactored){
        ArrayList<Integer> factorsOfNumber = new ArrayList<>();

        //Might as well just divide by 2 and see if its a whole number
        //Would depend on if there is any speed improvement for modules operator vs just dividing

        //Could be improved by making i a linked list and removing records when doing divison
        for(int i = 1; i<=numberToBeFactored; i++){
            if(numberToBeFactored % i == 0) {
                factorsOfNumber.add(i);
            }
        }

        return factorsOfNumber;
    }

    public boolean isPerfect(ArrayList<Integer> factorsOfPotentiallyPerfectNumber, int potentiallyPerfectNumber){
        int tmp = 0;
        factorsOfPotentiallyPerfectNumber.removeLast();

        //Could be fun to rewrite it as a lambda
        for (int i = 0; factorsOfPotentiallyPerfectNumber.size()>i; i++){
            tmp = tmp + factorsOfPotentiallyPerfectNumber.get(i);

        }

        if (tmp == potentiallyPerfectNumber){
            return true;
        }

        return false;
    }

    public int findKaprekarConstant(Integer numberToCalculateKaprekarConstant){
        //TODO implement
        //TODO add some debug logging too because it would be cool
        //TODO make recursive
        //TODO reach constant without keeping constant stored in mem ie dont have a int to check against?
            //Maybe if we get the same value multiple times in a row
        //Error checking for 4 digit number? and repdigit?
        int KapricoreConstant = 6174;

        //Rearrange the digits in the number from largest to smallest ie 1234 to 4321
        String stringToCalcualteConstant = numberToCalculateKaprekarConstant.toString();

        //Sort the string array
        stringToCalcualteConstant.chars();


        //Subtract the smaller digit from the larger digit

        //if the number isnt 6174 repeat unless you got 0000 then the number inputted is repdigits (all the digits in the number are the same)

        return KapricoreConstant;
    }
}