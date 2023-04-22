package project1;

public class task4 {
    public static void main(String[] args) {

        /*
        Create a 2D array of integers.
        Develop a program which will calculate the sum of even and odd numbers for that array.
         */
        int [] [] arrayD2={
                {33,44,55},
                {66,77,88},
                {99,11,22}
        };
       int  sumOdd=0;
       int sumEven=0;

        for (int i = 0; i < arrayD2.length; i++) {
            for (int j = 0; j < arrayD2[i].length; j++) {
                if (arrayD2[i][j] % 2 != 0) {
                    sumOdd += arrayD2[i][j];
                } else if (arrayD2[i][j] % 2 == 0) {
                    sumEven += arrayD2[i][j];
                }
            }

        }
        System.out.println("Sum of Odd numbers ="+sumOdd);
        System.out.println("Sum of Even numbrs ="+sumEven);
            }

    }

