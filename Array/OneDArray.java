import java.util.Arrays;
class OneDArray {
 public int[] resultingSum(int[] nums) {
   for(int i=1; i<nums.length ; i++) {
      nums[i] += nums[i-1];
   }
   return nums;
 }
 public static void main(String[] args) {
  OneDArray arr = new OneDArray();
  int[] nums = {1,2,3,4,5};
  int[] result = arr.resultingSum(nums);
  System.out.println(Arrays.toString(result)); 
 }
}