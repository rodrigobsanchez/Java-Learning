package ReadingFromUser;

import java.util.Scanner;

public class ScannerChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

       // this while implementation need to have break point... to prevent infinite loop.
        while(true){
            int order = counter +1;
            System.out.println("Enter a number #" + order + ":");

            boolean isAnInt = sc.hasNextInt();

            if(isAnInt){
                int number = sc.nextInt();
                counter++;
                sum += number;

                if(counter == 10){
                    break;
                }
            }else {
                System.out.println("Invalid Number!!");
            }

            sc.nextLine(); // handle end of line (enter key)
        }

        System.out.println("sum = " + sum);

        sc.close();
    }
}
