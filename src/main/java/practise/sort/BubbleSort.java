package practise.sort;

import java.util.Arrays;

/*
Compare adjacent values and place in required order
also, sinking sort
 */
public class BubbleSort {
    private static final String AES_ORDER = "AES";
    private static final String DESC_ORDER = "DESC";
    //Smallest first with nested for loop
    public int[] sortAscending(int [] arrayToBeSorted){
    int temp;
    int length = arrayToBeSorted.length;
    int count=0;
    //vertical traversal
    //while (length>0) {
        for(int j = length-1; j>= 0; j--){
        //horizontal traversal
        for (int i = 0; i < j; i++) {
            System.out.println(++count);
            if (arrayToBeSorted[i] > arrayToBeSorted[i + 1]) {
                temp = arrayToBeSorted[i];
                arrayToBeSorted[i] = arrayToBeSorted[i + 1];
                arrayToBeSorted[i + 1] = temp;
            }
        }
        //length--;
    }
        return arrayToBeSorted;
    }
    //largest first with while loop
    public static int[] sortDescending(int [] arrayToBeSorted){
    int temp;
    int length = arrayToBeSorted.length;
    int count =0;
    //vertical traversal
    while (length>0) {
        //horizontal traversal
        //at each iteration element at last is positioned correctly
        //so neglect last element in next iteration
        for (int i = 0; i < length- 1; i++) {
            System.out.println(++count);
            if (arrayToBeSorted[i] < arrayToBeSorted[i + 1]) {
                temp = arrayToBeSorted[i];
                arrayToBeSorted[i] = arrayToBeSorted[i + 1];
                arrayToBeSorted[i + 1] = temp;
            }
        }
        length--;
    }
        return arrayToBeSorted;
    }

    public int largestElement(int[] array){
        int temp;
        for(int i =0; i< array.length-1; i++){
            if(array[i]>array[i+1]){
                temp = array[i+1];
                array[i+1]= array[i];
                array[i]=temp;
            }
        }
        return array[array.length-1];
    }

    public int secondLargestElement(int[] array){
        int temp;
        int loop = 0;
        while(loop<2) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
            loop++;
        }
        return array[array.length-2];
    }
    //find xth largest element from an given array
    public int xthLargestElement(int[] array, int xth){
        int temp;
        int loop = 0;
        while(loop<xth) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
            loop++;
        }
        return array[array.length-xth];
    }
    /* example:
        input: [20, 6, 3, 9, 120, 12, 11, 5, 12, 2, -1]
        Ascending output: [-1, 2, 3, 5, 6, 9, 11, 12, 12, 20, 120]
        Descending output : [120, 20, 12, 12, 11, 9, 6, 5, 3, 2, -1]
     */
    public static void main(String[] args) {
        int[] array = {12,1,4,20,-1};
        BubbleSort sort = new BubbleSort();
        System.out.println("Ascending sort: "+Arrays.toString(sort.sortAscending(array)));
        System.out.println("Descending sort: "+ Arrays.toString(sortDescending(array)));
        System.out.println("largest element:"+ sort.largestElement(array));
        System.out.println("second largest element:"+ sort.secondLargestElement(array));
        System.out.println("xth largest element:"+ sort.xthLargestElement(array,4));
    }
}
