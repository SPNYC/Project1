package project1;

public class task6 {
    public static void main(String[] args) {
        /*
        Write a java program to check whether a given number is prime or not?
         */
        int num = 17;
        boolean isPrime = true;

        if (num > 1) {
            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        } else {
            isPrime = false;
        }

        if (isPrime) {
            System.out.println(num + "  is a prime number");
        } else {
            System.out.println(num + " is a not prime");
        }
    }
}
