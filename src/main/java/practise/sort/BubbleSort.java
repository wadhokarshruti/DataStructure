package practise.sort;

import java.util.Arrays;

/*
Compare adjacent values and place in required order
also, sinking sort
 */
public class BubbleSort {
    private static final String AES_ORDER = "AES";
    private static final String DESC_ORDER = "DESC";
    //Smallest first
    public static int[] sortAscending(int [] arrayToBeSorted){
    int temp;
    int length = arrayToBeSorted.length;
    //vertical traversal
    while (length>0) {
        //horizontal traversal
        for (int i = 0; i < length- 1; i++) {
            if (arrayToBeSorted[i] > arrayToBeSorted[i + 1]) {
                temp = arrayToBeSorted[i];
                arrayToBeSorted[i] = arrayToBeSorted[i + 1];
                arrayToBeSorted[i + 1] = temp;
            }
        }
        length--;
    }
        return arrayToBeSorted;
    }
    //largest first
    public static int[] sortDescending(int [] arrayToBeSorted){
    int temp;
    int length = arrayToBeSorted.length;
    //vertical traversal
    while (length>0) {
        //horizontal traversal
        //at each iteration element at last is positioned correctly
        //so neglect last element in next iteration
        for (int i = 0; i < length- 1; i++) {
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
    /* example:
        input: [20, 6, 3, 9, 120, 12, 11, 5, 12, 2, -1]
        Ascending output: [-1, 2, 3, 5, 6, 9, 11, 12, 12, 20, 120]
        Descending output : [120, 20, 12, 12, 11, 9, 6, 5, 3, 2, -1]
     */
    public static void main(String[] args) {
        int[] array = {100,20,15,30,5,75,40};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sortAscending(array)));
        System.out.println(Arrays.toString(sortDescending(array)));
    }
}
