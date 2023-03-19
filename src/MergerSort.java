import java.util.Arrays;
//Author: Saisiva Sababathy which implements Merge Sort Algorithm
public class MergerSort {


    public void sort(int[] data, int start, int end) {
        if(start<end) {
            int mid = (start+end)/2;
            sort(data,start,mid);
            sort(data,mid+1,end);
            merge(data,start,mid,end);

        }

    }

    public void merge(int[] data, int start, int mid , int end) {
        //for 4 element array (9,7,1,2) s-0,m-1,e-3
        int sizeOfLeft = mid-start+1;
        int sizeOfRight= end-mid;

        int[] left = new int[sizeOfLeft];
        int[] right = new int[sizeOfRight];

        for(int i=0;i<sizeOfLeft;i++) {
            left[i] = data[start+i];

        }
        for(int i=0;i<sizeOfRight;i++) {
            right[i]=data[mid+1+i];
        }
        int i=0, j=0;
        //after 1 st pass 1,9,1,2, 2 pass 1,2,1,2, 3rd pass -> 1,2,7,2 4 pass 1,2,7,9
        for(int k=start;k<=end;k++) {
            if(j>=sizeOfRight || (i < sizeOfLeft && left[i]<=right[j])) {
                data[k] = left[i];
                i++;
            }
            else {
                data[k] = right[j];
                j++;
            }
        }

    }

    public static void main(String[] args) {
        MergerSort ms = new MergerSort();
        int [] data = {2,9,19,87,98,78,10};
        ms.sort(data,0,data.length-1);
        System.out.println(Arrays.toString(data));
    }
}
