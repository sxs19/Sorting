import java.util.Arrays;
import java.util.Random;

/*
@ Author Saisiva Sababathy
Implementation of Selection Sort
 */
public class SelectionSort {

    public static void selSort(int [] sort) {

        //implement selection sort, find the min element in the array and bring it to for 0th index and continue interation

        for(int i=0;i<sort.length;i++) {
            int minVal = sort[i];
            int minIdx = i;
            for(int j=i+1;j<sort.length;j++) {
                //This if moves the min value to min index
                if(sort[j]<minVal) {
                    //System.out.println(sort[i]+"--"+sort[j]);
                    //reorder the array
                    minVal=sort[j];
                    minIdx=j;
                }

            }
            int tmp = sort[i];
            sort[i] = sort[minIdx];
            sort[minIdx]=tmp;

        }

        System.out.println(Arrays.toString(sort));

    }

    public static void main(String args[]) {
        int a[] = new int[] {29,77,66,0,7,3,276,9,6};
        Random rand = new Random();
        int[] numbers = new int[1000000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }
        long start =System.currentTimeMillis();
        selSort(numbers);
        System.out.println("Time -"+(start-System.currentTimeMillis()));

    }
}
