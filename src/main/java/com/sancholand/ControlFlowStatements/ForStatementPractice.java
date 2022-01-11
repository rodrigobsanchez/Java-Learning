package ControlFlowStatements;

public class ForStatementPractice {

    public static void main(String[] args) {


//        for (int i = 2; i<9; i++){
////            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, (double)i)));
////        }

//        int count = 0;
//        for (int i = 10; i <= 1000; i++){
//            //check if the method return true.
//            if(isPrime(i)){
//                count ++;
//                System.out.println("Number " + i + " is a prime number");
//            }
//            if(count == 50){
//                System.out.println("First 50 prime numbers");
//                break;
//            }
//        }
//        int sumOfNum = 0;
//////        int count = 0;
//////        for (int j = 1 ; j<=1000; j++){
//////            if((j % 3 ==0) && (j % 5 == 0)){
//////                System.out.print(j);
//////                sumOfNum = sumOfNum + j;
//////                count++;
//////                if(count == 5){
//////                    break;
//////                }
//////                System.out.print(" + ");
//////            }
//////        }
//////        System.out.println(" = "+sumOfNum);

        int x = sumOdd(10, 5);

        System.out.println(x);

    }

    //Check if the number is Odd.
    public static boolean isOdd(int n){
        if(n < 0 ){
            return false;
        }
        else if(n == 1){
            return true;
        }
        else if(n % 2 != 0){
            return true;
        }
        else {return false;}
    }

    //Sum all odd numbers between
    public static int sumOdd(int start, int end){
        int sumofOdds = 0;
        boolean test = false;
        if(start < 0 || end < 0){
            return -1;
        }
        else if (end >= start && ((start > 0) && (end > 0))){

            for(int i = start; i <= end; i++){
                //calling previous method..
                test = isOdd(i);
                if(test == true){
                    sumofOdds = sumofOdds + i;
                }

            }
        } else {return -1;}

        return sumofOdds;
    }



    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate  / 100));
    }

    public static boolean isPrime(int n){
//        if(n == 1){
//            return false;
//        }
//        for (int i=2; i<= n/2; i++ ){
//            if(n% i == 0){
//                return false;
//            }
//        }
//        return true;
//    }
        //BETTER VERSION of it
        if(n == 1){
            return false;
        }
        for (int i=2; i<= (long) Math.sqrt(n); i++ ){
            if(n% i == 0){
                return false;
            }
        }
        return true;
    }
}
