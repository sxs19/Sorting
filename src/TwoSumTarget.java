import java.util.Arrays;

public class TwoSumTarget {

    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]+nums[j]==target) {
                    System.out.println("i"+nums[i]+"j="+nums[j]);
                    return new int[] {i,j};
                }
            }
        }
        //No solution return null
        return null;
    }

    public static void main(String args[]) {
        TwoSumTarget tw = new TwoSumTarget();
        System.out.println(Arrays.toString(tw.twoSum(new int[] {3,2,4},6)));

    }
}
