package com.sancholand.randomstuff;

public class SecondAndMinuted {

    // final variable cannot be change... write with '_'  It's called CONSTANT variable... don't change.
     private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
       //String answer = getDurationString( -1,0);
       // System.out.println(answer);

      // String answerSeconds = getDurationString(3660);
       // System.out.println(answerSeconds);

        printYearsAndDays(8000000);

    }

    private static String getDurationString(long minutes, long seconds){
        if((minutes <0 || (seconds < 0) || seconds > 59)){
            return INVALID_VALUE_MESSAGE;
        }
        int hours = (int)minutes / 60;
        minutes = (minutes % 60);
        /*
        String.format ( 1st receive the string... with the positon %d (this case because will receive a integer.)
        and after , name the variable in the right order.
         */
        String time = String.format("%d h %d m %d s", hours, minutes, seconds);
        return time;
    }

    private static String getDurationString(long seconds){
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds/ 60;
        seconds = seconds % 60;

        return getDurationString(minutes, seconds);

    }

    private static void printYearsAndDays(long minutes){
        int years = 0;

        if(minutes < 0 ){
            System.out.println(INVALID_VALUE_MESSAGE);
        }
        else{
            int days = (int) minutes / 1440;
            long remainMinutes = (int) minutes % 1440;
            String exactMinutes = getDurationString(remainMinutes, 0);

            if(days == 365){
                years = 1;
                days = 0;
                System.out.println(minutes + " = "+ years + " years " + days + " days " + exactMinutes + " time");
            }else if (days < 365){
                System.out.println(minutes + " = "+ years + " years " + days + " days " + exactMinutes + " time");
            }
            else if (days > 365){
                years = days / 365;
                days = days % 365;
                System.out.println(minutes + " = "+ years + " years " + days + " days " + exactMinutes + " time");
            }
        }



    }
}
