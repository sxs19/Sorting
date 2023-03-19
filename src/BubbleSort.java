import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void bubblesrt(int [] sortme) {
        int n = sortme.length;
        System.out.println("ArrayLength="+n);
        for (int i=0;i<n-1;i++) {
            //second for loop at the end of first pass sorts by pushing the biggest number to the end of the array
            for (int j=0;j<n-i-1;j++) {
                if(sortme[j]>sortme[j+1]) {
                    int tmp = sortme[j];
                    sortme[j] = sortme[j+1];
                    sortme[j+1]=tmp;
                }
                System.out.println("J="+j+"--"+Arrays.toString(sortme));
            }
        }
        System.out.println("Final"+Arrays.toString(sortme));

    }

    public static void main(String args[]) {
        int a[] = new int[] {29,77,66,0,7,3,276,9,6};

        bubblesrt(a);


    }
}
