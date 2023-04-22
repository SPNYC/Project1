package project1;

public class task9 {
    public static void main(String[] args) {

        //Write a java program to find the second largest number in the array?

        int [] array={34,89,12,99,23,57};
        int max=array[0];
        int secondMax=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max ){
                secondMax=max;
                max=array[i];
            } else if(array[i]>secondMax) {
                secondMax=array[i];
            }
        }
        System.out.println("Second largest number is "+secondMax);
    }
}
