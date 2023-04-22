package project1;

public class task2 {
    public static void main(String[] args) {

        /*
        Create an array of integer values.
        After the array is created, calculate the sum of all stored elements in that array.
         */

        int [] array={23,14,35,46,58};
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println("The sum of all stored elements is "+sum);
    }
}
