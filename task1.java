package project1;

public class task1 {
    public static void main(String[] args) {
        /*
        Create a program that uses an array to store a list of temperatures for a week,
        and then uses a loop to find the highest and lowest temperature for the week.
         */
         int [] weekTemperature ={10,17,12,23,16,18,19};

         int lowTemperature=weekTemperature[0];
         int highTemperature=weekTemperature[0];

         for (int i = 0; i< weekTemperature.length; i++) {

             if (weekTemperature[i]>highTemperature) {
                 highTemperature = weekTemperature[i];}

                else if (weekTemperature[i] < lowTemperature) {
                     lowTemperature = weekTemperature[i];

                 }
             }

        System.out.println("The lowest temperature for the week is " + lowTemperature);
        System.out.println("The highest temperature for the week is " + highTemperature);
    }
}
