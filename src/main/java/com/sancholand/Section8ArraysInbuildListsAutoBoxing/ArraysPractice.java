package Section8ArraysInbuildListsAutoBoxing;

import java.util.Scanner;

public class ArraysPractice {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         SortingAnArray sa = new SortingAnArray();
        // int n = scanner.nextInt();


        int[] myIntArray = new int[1000]; // regular standard way...
        int[] myIntArray2 = {1, 32, 42, 52, 63 ,13, 5 ,8,9,10}; // a bit of a shortcut to add faster... unusual...
        //int[] myArray3 = sa.inputValues(n);
        for(int j = 0; j < myIntArray.length ; j++){
            int num = (int) (Math.random() * 1001); // random number between 0 - 1001;
            myIntArray[j] = num;
            if(num == 0){
                myIntArray[j] = num;
            }else if ( num % 2 == 0){
                myIntArray[j] = num;
            }else if ( num % 10 == 0){
                myIntArray[j] = num;
            } else { j--; }
        }

       long begin = System.currentTimeMillis();
 //         sa.printArray(myArray3);

        sa.printArray(myIntArray);
        sa.sourtingArray(myIntArray);
////        sa.printArray(myIntArray2);
////        sa.sourtingArray(myIntArray2);
//
        System.out.println();
        System.out.println("********************************************");
        System.out.println();
  //       sa.printArray(sa.sortDescendingOrder(myIntArray));
        sa.printArray(myIntArray);
//        System.out.println(" Avarage of all numbers --> " +sa.getAverage(myIntArray));
//        sa.mediana(myIntArray);
//        sa.moda(myIntArray);
        long end = System.currentTimeMillis();
        System.out.println("////////*******//////\n" +(end - begin) + " miliseconds to execute");
        //sa.printArray(myIntArray2);


    }
}
