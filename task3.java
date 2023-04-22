package project1;

public class task3 {
    public static void main(String[] args) {

        /*
        Create a 2D array or integer type where you will store odd and even numbers.
        Develop a program which will identify/print the even numbers only.
         */

        int [] [] arrayD2={
                {33,44,55},
                {66,77,88},
                {99,11,22}
        };
        for (int i = 0; i < arrayD2.length; i++) {
            for (int j = 0; j < arrayD2[i].length; j++) {
                if (arrayD2[i][j]%2==0)
                    System.out.print(arrayD2[i][j]+" ");
            }
        }
    }
}
