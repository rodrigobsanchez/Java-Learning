package Section8ArraysInbuildListsAutoBoxing;

import java.util.Arrays;
import java.util.Scanner;

public class SortingAnArray  {

    public static Scanner sc = new Scanner(System.in);
   /*
   ** \r (carriage return) stants for...'Back to the beginning of the line without moving down a line'
   ** \f  is (as you said) a formfeed, it tells old-fashioned printers to start a new page. In computer documents,
    it's sometimes used to indicate a page break.
   ** \n 'move down a line'
    */


    public int[] inputValues(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for(int i = 0; i < capacity; i++){
            array[i] = sc.nextInt();
        }
        return array;
    }


    // SORTING ASCENDING ORDER!!
    public void sourtingArray(int[] a){
        System.out.println(" \n Sorting....");
        for (int i = 0; i < a.length; i++) {

            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < a.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    numberOfSwaps++;
                }

            }
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }

        }
    }

    //DESCENDING ORDER!!!!
    public int[] sortDescendingOrder(int[] b){
        int[] sortedArray = new int[b.length];
        //Another way of copying an array is
                                         //   sortedArray = Arrays.copyOf(b, b.length);
        for(int i = 0; i < b.length; i++){
            sortedArray[i] = b[i];
        }
        boolean flag = true;
        int temp;

        /*
          while loop to make the sorting... boolean flag and temp variable to help swaping 2 elements that fits the
        condition.
        *** ANOTHER TYPE OF SORTING ALGORITHM
         */
        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length -1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;

    }

    public void printArray(int[] a){
        for(int i = 0; i < a.length ; i++){
            if(i == a.length-1){
                System.out.print(a[i] + ".");
                break;
            } else {
                System.out.print(a[i] + ", ");
            }
            if(i % 20 == 0 && i > 0){
                System.out.println();
            }
        }
        System.out.println();
    }

    public double getAverage(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        System.out.println("\n A soma de todos os elementos eh " + sum);
        return (double) sum / (double)a.length;
    }
    // PRINT MODA... number with more repetition through the array.
    public void moda(int[]temp) {
        int moda = 0;
        int maxcount = 0;
        for(int i =0; i < temp.length; i++) {
            int count = 0;
            // combina primeiro elemento com os restantes... depois segundo... terceiro...
            for(int j=i+1; j<temp.length; j++) {

                if( temp[i] == temp[j]) {
                    count++;
                }
            }
            // acha o maior contador de numeros repetidos... e coloca esse numero na variavel
            if (count >= maxcount ) {
                maxcount = count;
                moda = temp[i];
            }
        }
        if(moda > 0) {
            System.out.println("Moda: " +moda +" "+ maxcount+ "x" + "( Possuindo mais de uma Moda retornara a maior delas)");
        }
        else { System.out.println("Moda: nao possui elementos repetidos...");}
    }

    public void mediana(int[]temp) {
        int[] grow = new int[temp.length];
        int number;
        int mediana;

        // Sorting an array of numbers....ascending!
//        for(int i =0; i < temp.length ; i++) {
////            // ATENTION para o ' j = i+1' sempre ira comparar com o proximo numero... assim reeditando o array.
//////            for(int j = i+1; j < temp.length; j++) {
//////                if(temp[i] > temp[j]) {
//////                    number = temp[i];
//////                    temp[i] = temp[j];
//////                    temp[j] = number;
//////
//////                }
//////            }
//////        }
        grow = temp;
        mediana = grow[grow.length/2];
        System.out.println();
        System.out.println("Mediana: "+mediana);
    }

    public void reverserArray(int[] n) {
        int maxIndex = n.length-1;
        int halfLength = n.length /2;

        for(int i = 0; i < halfLength; i++){
            int temp = n[i];
            n[i] = n[maxIndex -i];
            n[maxIndex - i] = temp;
        }

    }
}
