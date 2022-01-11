package ReadingFromUser;

import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        boolean first = true;
        System.out.println("Starting... to exit loop enter a char instead of an integer");
        while(true){
            System.out.println("Enter number: ");
            boolean isAInt = sc.hasNextInt();

            if(isAInt) {
                int number = sc.nextInt();

                // this if only executes once for the first number input by the 2nd it won't execute
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if(number > max) {
                    max = number;
                }
                if(number < min){
                    min = number;
                }
            } else {
                break;
            }
            sc.nextLine(); // handle input
        }
        System.out.println("min = " + min + ", max = " + max);
           sc.close();
    }
}
