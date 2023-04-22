package project1;

public class task8 {
    public static void main(String[] args) {

        //Maximum and minimum number in the array

        int [] array={34,89,12,99,23,57};
        int max=array[0];
        int min=array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i]>max) {
                max=array[i];
            } else if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Maximum number = "+max);
        System.out.println("Minimum number = "+min);
    }
}
