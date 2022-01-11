package ControlFlowStatements;

public class SwitchMoreExercices {

    public static void main(String[] args) {
      getDaysInMonth(1, 2020);
      getDaysInMonth(2, 2020);
      getDaysInMonth(2, 2018);
      getDaysInMonth(-1, 2020);
      getDaysInMonth(1, 2020);

    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            System.out.println("year not in range...");
            return false;
        }
        if (year % 4 == 0 && (year % 100 != 0 || year >= 400)) {

            if (year % 400 == 0) {
                System.out.println("LEAP YEAR");
                return true;
            }else if (year % 4 == 0){
                System.out.println("LEAP YEAR");
                return true;
            }
            else {
                System.out.println("The " + year + " is NOT a Leap year.");
                return false;
            }
        } else {
            System.out.println("The " + year + " is NOT a Leap year.");
            return false;
        }

     }

     public static int getDaysInMonth(int month, int year){
        int numDays = 0;
        boolean leap = false;
        if( (month < 1 || month > 12 ) || (year < 1 || year > 9999)){
            return -1;
        }
        leap = isLeapYear(year);

        if(month == 1){
            numDays = 31;
            System.out.println("January - 31 days ");
        } else if (month == 2){

            if(leap == true){
                System.out.println("February has 29 days when in a Leap Year");
                numDays = 29;
            }else {
                System.out.println("February has 28 days");
                numDays = 28;
            }
        }else if (month == 3){
            System.out.println("March 31 days");
            numDays = 31;
        }else if (month == 4){
            System.out.println("April 30 days");
            numDays = 30;
        }else if (month == 5){
            System.out.println("May 31 days");
            numDays = 31;
        }else if (month == 6){
            System.out.println("June 30 days");
            numDays = 30;
        }else if (month == 7){
            System.out.println("July 31 days");
            numDays = 31;
        }else if (month == 8){
            System.out.println("August 31 days");
            numDays = 31;
        }else if (month == 9){
            System.out.println("September 30 days");
            numDays = 30;
        }else if (month == 10){
            System.out.println("October 31 days");
            numDays = 31;
        }else if (month == 11){
            System.out.println("November 30 days");
            numDays = 30;
        }else{
            System.out.println("December 31 days");
            numDays = 31;
        }


        return numDays;
     }
  }

