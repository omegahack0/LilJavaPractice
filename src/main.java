import java.util.LinkedList;

class main {
    public static void main(String args[]) {
        System.out.println("Amount of Odd Numbers");
        System.out.println(findOddNumber(1000));
        System.out.println("Find Prime Numbers");
        System.out.println(findPrimeDigit(1000));

    }

    public static LinkedList<Integer> findOddNumber(int amountOfOddNumbers){
        LinkedList<Integer> OddNumbers = new LinkedList<>();
        int i = 0;
        while(amountOfOddNumbers > OddNumbers.size()){
            if(i % 2 >= 1){
                //Modulus Operator Explanation
                //https://stackoverflow.com/questions/17524673/understanding-the-modulus-operator
                OddNumbers.add(i);
            }
            i++;
        }
        return OddNumbers;
    }

    public static LinkedList findPrimeDigit(int amountOfPrimeNumbers){
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
}