package project1;

public class task10 {
    public static void main(String[] args) {
        /*Write a program to print out duplicate elements from
        an Array of Strings
         */
        String [] array ={"Shop", "Bakery", "Shop", "Shop", "Grocery", "Deli"};


        for (int i = 0; i < array.length ; i++) {
            for (int j =i+ 1; j <array.length ; j++) {
                if (array[i].equals(array[j])){
                    System.out.println("duplicate element: "+array[i]);
                }
            }
        }
    }
}

