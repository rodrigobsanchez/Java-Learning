package ControlFlowStatements;
import java.util.*;

public class SwitchPractice {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int swtchValue = s.nextInt();
        //Way of inputing with scanner a char type... ,charAt(0) gives me the first char from the String(= char[])
        char charValue = s.next().charAt(0);
        int day = s.nextInt();
//        int value = 3;
//        if(value == 1){
//            System.out.println("1");
//        } else if (value == 2){
//            System.out.println("2");
//        } else if (value == 3){
//            System.out.println("3");
//        } else {
//            System.out.println("no match");
//        }

        /*
        CAN USE switch command to replace the if else logic above..
        CAN ONLY BE USED WITH 4 primitive types: short, byte, char and int and STRING for Java version > 5.
         */



        switch(swtchValue) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
                // possible to put cases on after the other...
            case 4: case 5: case 6:
                System.out.println("Bigger than 3 less than 6");
                break;
                // default means the 'else' "Any other case goes into default statement"
            default:
                System.out.println("Was not any of 1 to 3 numbers");
        }



        switch(charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
                System.out.println("C was found");
                break;
            case 'D': case 'E': case 'F':
                System.out.println( charValue + " was found");
                break;
            default:
                System.out.println("None of them was corrected!!");
        }

        switch(day){
            case 0:
                System.out.println("Sunday!");
                break;
            case 1:
                System.out.println("Monday!");
                break;
            case 2:
                System.out.println("Tuesday!");
                break;
            case 3:
                System.out.println("Wednesday!");
                break;
            case 4:
                System.out.println("Thursday!");
                break;
            case 5:
                System.out.println("Friday!");
                break;
            case 6:
                System.out.println("Saturday!");
                break;
            default:
                System.out.println("Must be an number between 0-6");
        }
    }
}
