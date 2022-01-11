package Section8ArraysInbuildListsAutoBoxing;

import java.util.Arrays;
import java.util.Scanner;

public class ReferenceTypesVSValueTypes {


    /*
    REFERENCE --> address to the object but NOT THE OBJECT itself.
ATTENTION FOR ARRAYS.CLASS have some intereting methods.
     */
    public static void main(String[] args) {
        SortingAnArray sa = new SortingAnArray();
        Scanner scanner = new Scanner(System.in);
        ReferenceTypesVSValueTypes rt = new ReferenceTypesVSValueTypes();
          int intValue = 10;
          int otherInt = intValue;

          int[] myArray = {1, 32, -32, 4, 55, 2, 3};
          int[] arr = myArray;

        System.out.println("myIntArray = " + Arrays.toString(myArray));
        System.out.println("myIntArray = " + Arrays.toString(arr));

        //arr[0] = 111; // will change both arrays because they refer to same array address.

        System.out.println("myIntArray = " + Arrays.toString(myArray));
        System.out.println("myIntArray = " + Arrays.toString(arr));

       // sa.inputValues(scanner.nextInt());
        int answer = rt.findMin(myArray);
        System.out.println(answer);
        sa.reverserArray(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    /*
    EXAMPLE OF FOR-EACH loop!!!!!!!
     */
    private int findMin(int[] array){
        int min = Integer.MAX_VALUE;
       //FOR EACH!!
        for(int i : array){  // same as for(int i = 0; i< array.length; i++)
            int value = i; // variable 'i' will receive values from each array value.

            if(value < min){
                min = value;
            }else {
                continue;
            }
        }

        return min;
    }
}
