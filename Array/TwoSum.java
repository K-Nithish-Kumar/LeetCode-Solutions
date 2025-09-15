//Leetcode problem 1
//Two Sum
import java.util.HashMap;
import java.util.Arrays;
class TwoSum {
   public static int[] twosum(int[] nums,int target){
       HashMap<Integer,Integer> pairIdx = new HashMap<Integer,Integer>();
       for(int i = 0; i <nums.length-1; i++) {
           int num = nums[i];
           if(pairIdx.containsKey(target-num)) {
                return new int[] {i,pairIdx.get(target-num)};
           }
           pairIdx.put(num,i);
        }
        return new int[] {};
    }
 public static void main(String args[]) {
   TwoSum s = new TwoSum();
   int[] nums = {2,7,11,15};
   System.out.println(Arrays.toString(twosum(nums,9)));
 }
}

