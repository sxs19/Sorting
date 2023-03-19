

import java.util.Arrays;

public class InsertionSorter {

    public static void main(String[] args) {
        int[] data = {1,7,3,6,8,2};
       // int[] data = {1,1};
        System.out.println("original==>"+Arrays.toString(data));
        new InsertionSorter().sort(data);
        System.out.println("final==>"+Arrays.toString(data));
    }

    public void sort(int[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            System.out.println("J="+j+"Key="+key);

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && key < arr[j]) {
                //System.out.print(arr[j+1]+":"+arr[j]+"--");
                arr[j + 1] = arr[j];
                System.out.println("while==>"+Arrays.toString(arr));

                j = j - 1;
                //System.out.print("-->j=="+j);
            }
            arr[j + 1] = key;// value j which is an index is determined  line 31, now copy the key to that index which is sorted order for the give subset of array
            System.out.println("~~~"+Arrays.toString(arr));
            //System.out.println();
        }

    }


}
