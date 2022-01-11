package ControlFlowStatements;

import java.util.Scanner;

/*
Parsing Values from a String...

 */
public class ParsingValuesFromString {

    public static void main(String[] args) {

        String numberAsString = "2018";
        System.out.println("numberAsString = "+ numberAsString);

        //Wrapper class Integer has a function (static method) convert type String to int.
//        int num = Integer.parseInt(numberAsString);
//        numberAsString += 1;
//        num+=1;
//        String novo = Integer.toString(num);
//        System.out.println(numberAsString); // print 20181
//        System.out.println(num); // print 2019
//        System.out.println(novo); // print '2019' as a String
//        String novo2 = numberAsString + novo;
//        System.out.println(novo2); //print 201812019
//        boolean a = canPack(askNumber(),askNumber(),askNumber());
//        System.out.println(a);

        int test = askNumber();
        System.out.println(getLargestPrime(test));

    }

    public static int askNumber(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    /*
    HORRIBLE METHOD START OVER SEARCH FOR SIMPLER WAY OF DOING IT...
     */

    // a = bigount (5 kilos pack) , b = smallCount (1 kilo pack) , c = goal
    public static boolean canPack(int a, int b, int c){
            int count = 0;
            int remainder = 0;
        if((a < 0)||(b < 0) || (c < 0)) {
            return false;
        }

        while(c > 0){

            if (c % 5 == 0) {
                if (a * 5 >= c) {
                    count = c / 5;
                    c -= count * 5;
                    return true;
                } else if (a * 5 <= c) {

                    while (a > 0) {
                        c -= 5;
                        a--;
                    }
                    if ((c <= b) || (c > b)) {
                        while (b > 0) {
                            b--;
                            c--;
                        }
                    }
                    continue;
                }
            }
            else if (c % 5 != 0){
                if(b == 0){return false;}
                else {
                    while (b > 0) {
                        if(c == 0){return true;}
                        c--;
                        b--;
                        if ((c % 5 == 0) && (a != 0)) {
                            count = c / 5;
                            if(count <= a) {
                                c -= count * 5;
                                return true;
                            }
                            else if (count > a){
                                while(a > 0){
                                    c -= 5;
                                    a--;
                                }
                            }
                        }
                    }
                }

            }
        }

        if(c == 0){ return true;}
        return false;
    }

    //METHOD PRATICE Find the largest Prime factor of a given number.

    public static int getLargestPrime (int num){
        int highPrime = 0;
        boolean isPrime = true;
        if(num <= 1){
            return -1;
        }
        //Checking if 'num' is Prime... if true it is the answer
        for (int i=2; i<= (long) Math.sqrt(num); i++ ){
            if(num% i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            return num;  // ending method
        }else{

            isPrime = true;
            for (int i = num-1; i <=  num; i-- ){
                if(num % i == 0){
                    for (int j=2; j<= i; j++ ){
                        if(i % j == 0){
                            isPrime = false;

                            if(i == j){
                                isPrime = true;
                                break;
                            }
                            break;
                        }
                    }
                    if(isPrime) {
                        highPrime = i;
                        return highPrime;
                    }
                }
            }

        }
        return highPrime;
    }
}
