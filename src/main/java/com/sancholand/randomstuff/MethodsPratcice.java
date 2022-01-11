package com.sancholand.randomstuff;

public class MethodsPratcice {
    /*
     OVERLOADING A METHOD... simply using the same name and arguments for the method...
     changing its body, changing his behavior.
     */

    private Integer value;

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New Socre is: " + newScore);
        int unnamed = calculateScore(400);
        System.out.println(unnamed);
        calculateScore();
       // calcFeetAndInchesToCentimeters(6, 10);
        calcFeetAndInchesToCentimeters(157);
    }

    private static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;

    }

    //Overloading the method changing the parameters.
    private static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    /*
    if you make a void method but keep the same arguments...it WON'T be a overloading method.
     */
    private static int calculateScore() {
        System.out.println("Neither there is a player nor a score");
        return 0;
    }
        public Integer getValue(){
            return value;
        }

        public void setValue (Integer value) {
            this.value = value;
        }
    private static double calcFeetAndInchesToCentimeters(double feet, double inches){
        //validation of the method. Checking for valid parameters. See if feet or inches are negative or inches greater than 12;
        if((feet < 0) || ((inches < 0) || (inches > 12))){
            //return -1 because...
            System.out.println("Invalid feet or inches parameters");
            /*
            REMEMBER that return can work as 'break' of loops... good way of testing the method and it's parameters.
             */
           return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;

        System.out.println(feet + " feet, "+ inches + " inches = "+ centimeters + " cm.");
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }
        /*
        CASTING making sure it will be a INTEGER -> where a double is 13.9 casting to int would be 13! So rounding down
        the number to a INT.
         */
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches.");
        //calling the first calcFeet method...
       return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

}
