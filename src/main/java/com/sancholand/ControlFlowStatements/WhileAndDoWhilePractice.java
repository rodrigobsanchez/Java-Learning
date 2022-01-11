package ControlFlowStatements;

import java.util.Scanner;

public class WhileAndDoWhilePractice {

    public static void main(String[] args) {

        /*
        Format of do-while statement. Diference to normmal while is... will execute at least one time even if the condition
        of the while is false.
         */
       int test = 0;
       do {
        ++test;
        System.out.println(test);
       } while(test !=6);
        System.out.println("Choose 2 numbers...1st- beginning 2nd ending number");


        int number = askNumber();
        int finishNumber = askNumber();

      do{
          number++;
          // TESTING the boolean method if isEven == false.
          if(!isEven(number)){
              //break from the loop run.. start the next one
              continue;
          }
          System.out.println("Even Number -> "+ number);


      } while(number <= finishNumber);

        //int test = askNumber();
        long test2 = askLongNumber();
       // int answer = reverseNumber(test);
       // System.out.println(answer);
      int answer2 = getEvenDigitSum(test);
       boolean b = isPerfectNumber(test);
        System.out.println(b);
       printWords(test2);
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumDigits(int number){
        int temp = number;
        int sumOfAll = 0;
        int sumOfDigits = 0;
        if( number < 10 ){
            return -1;
        }
        else {
            do {
                sumOfAll = sumOfAll + number;
                number--;
            } while (number != 0);

        }
        while(temp > 0) {
            sumOfDigits += temp % 10; // extract the last digit.

            temp = temp / 10; // eliminate last digit

        }
        //sumDigits(125) should return 8 - 1+2+5;
        System.out.println("The sum of digits is ... " + sumOfDigits);
        return sumOfAll;
    }
    public static int askNumber(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        return n;
    }public static long askLongNumber(){
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        return n;
    }

    public static boolean isPalindrome(int n){
        int work = n;
        int reverseNum = 0;

        while(work != 0){
            int lastDigit = work % 10;
            reverseNum *= 10;  // adding up a casa de numero

            if(lastDigit == 0) {
                //reverseNum *= 10;
                work /= 10;
                continue;   // walks out of the current loop session going to the next...
            }
            else {
                reverseNum += lastDigit ; // adding the last digit to corresponding place what the number: 700 + 7 = 707;

            }

            work /= 10;
        }
        if(reverseNum != n){
            return false;
        }
        else {
            return true;
        }
    }

    private static int sumFirstAndLastDigit(int n){

        if(n < 0) return -1;
        int work = n;
        int sum = 0;
        sum = work % 10;  // receive last number

        while(work > 0){

            if(work < 10){
                sum = sum + (work % 10);
            }
            work /= 10;
        }
        return sum;
    }

    private static int getEvenDigitSum(int n){
        if(n < 0){
            return -1;
        }
        int sum = 0;
        int work = n;

        do{
            int lastDigit = work % 10;
            if(lastDigit % 2 == 0){
                sum += lastDigit;
            }
            work /= 10;
        }
        while(work > 0);
        return sum;
    }


    //comparing to number checking for the first equal number they have... ONLY THE FIRST
    public static boolean hasSharedDigit(int num1, int num2){
        int work1 = num1;
        int work2 = num2;
        int last1 = 0;
        int last2 = 0;
        if(((num1 > 99) || (num2 > 99)) || ((num1 < 10) || (num2 < 10))){
            return false;
        }

        //can add a second statement at the end of the for.
        for(int i = work1; i>0; i/= 10){
                last1 = i%10;
            for(int j = work2; j > 0; j/= 10){
                last2 = j % 10;
                if (last1 == last2){
                    System.out.println(i);
                    return true;

                }
            }
        }
        return false;
    }
    public static void printFactors(int num){

        if(num < 1){
            System.out.print("print"+"Invalid Value"+" since number is < 1");
        }else {
            int i = 1;
            System.out.print("print ");
            while(i <= num){
                if(num % i == 0 ){
                    System.out.print(i + " ");
                }
                i++;
            }

        }
    }
    public static boolean isPerfectNumber(int num){
          int sum = 0;
        if(num < 1){
            return false;
        }else {
            int i = 1;
            while(i < num){
                if(num % i == 0 ){
                    sum += i;
                }
                i++;
            }
        }
        if(sum == num){
            return true;
        }else {
            return false;
        }
    }

    public static void printWords(long n){
        long nReverse = reverseNumber(n);
        long lastDigit = 0;
        if(n < 0){
            System.out.println("Invalid Number");
        }
        System.out.println();
        while(nReverse !=0){
            lastDigit = nReverse % 10;

            if(lastDigit == 0){
                System.out.print("Zero");
            }else if (lastDigit == 1){
                System.out.print("One");
            }else if (lastDigit == 2){
                System.out.print("Two");
            }else if (lastDigit == 3){
                System.out.print("Three");
            }else if (lastDigit == 4){
                System.out.print("Four");
            }else if (lastDigit == 5){
                System.out.print("Five");
            }else if (lastDigit == 6){
                System.out.print("Six");
            }else if (lastDigit == 7){
                System.out.print("Seven");
            }else if (lastDigit == 8){
                System.out.print("Eight");
            }else if (lastDigit == 9){
                System.out.print("Nine");
            }
            if(nReverse < 10){
                break;
            }
            nReverse /= 10;
            System.out.print(" ");
        }

    }
    public static long reverseNumber(long n){
        long reverseNum = 0;
        while(n != 0){
            long lastDigit = n % 10;
            reverseNum *= 10;  // adding up a casa de numero

            if(lastDigit == 0) {
                n /= 10;
                continue;   // walks out of the current loop session going to the next...
            }
            else {
                reverseNum += lastDigit ; // adding the last digit to corresponding place what the number: 700 + 7 = 707;
            }
            n /= 10;
        }
        return reverseNum;
    }
}
