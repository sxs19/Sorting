

import java.util.Arrays;
import java.util.*;

public  class CountingSorter {

    private LinkedHashSet<Integer> cacheList;
    private LinkedHashMap<String,String> cacheMap;

    public void sort(Integer[] data) {
        int[] temp = new int[data.length];

        for (int i = 0; i < data.length; i++) { // populate the temp array
            temp[data[i]] = temp[data[i]] + 1;
        }

        int curr = 0;

        for (int i = 0; i < temp.length; i++) { // k iterations
            for (int j = 0; j < temp[i]; j++) { // n/k iterations for each (avg)
                data[curr] = i;
                System.out.println(Arrays.deepToString(data));
                curr++;
            }
        }
    }

    public static void main(String[] args) {
        CountingSorter sorter = new CountingSorter();
        Integer[] data = new Integer[] { 3, 10, 2, 4, 2, 6, 9, 5, 7, 2, 8, 10, 3, 9 };
        sorter.sort(data);
        System.out.println("Final"+Arrays.deepToString(data));
    }

}
