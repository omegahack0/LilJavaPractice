import java.util.LinkedList;

class main {
    public static void main(String args[]) {
        System.out.println("Amount of Odd Numbers");
        System.out.println(findOddNumber(1000));
        System.out.println("Find Prime Numbers");
        System.out.println(findPrimeDigit(1000));
        System.out.println("Find Perfect Numbers");
        System.out.println(findPerfectNumber(10));
        System.out.println("Find Kapricore Constant");
        System.out.println(findKapricoreConstant(0124));

    }

    public static LinkedList<Integer> findOddNumber(int amountOfOddNumbers){
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

    public static LinkedList<Integer> findPrimeDigit(int amountOfPrimeNumbers){
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

    public static LinkedList<Integer> findPerfectNumber(int amountOfPerfectNumbers){
        LinkedList<Integer> PerfectNumbers = new LinkedList<>();
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

    public static LinkedList<Integer> findFactors(int numberToBeFactored){
        LinkedList<Integer> factorsOfNumber = new LinkedList<>();

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

    public static boolean isPerfect(LinkedList<Integer> factorsOfPotentiallyPerfectNumber, int potentiallyPerfectNumber){
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

    public static int findKapricoreConstant(Integer numberToCalculateKapricoreConstant){
        //TODO implement
        //Error checking for 4 digit number? and repdigit?
        int KapricoreConstant = 6174;

        //Rearrange the digits in the number from largest to smallest ie 1234 to 4321
        String stringToCalcualteConstant = numberToCalculateKapricoreConstant.toString();

        //Sort the string array
        stringToCalcualteConstant.chars();


        //Subtract the smaller digit from the larger digit

        //if the number isnt 6174 repeat unless you got 0000 then the number inputted is repdigits (all the digits in the number are the same)

        return KapricoreConstant;
    }
}