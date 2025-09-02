class removeDuplicate {
   public int removingDuplicate(int[] nums) {
      int i = 1;
      for(int j = 1; j < nums.length; j++) {
         if(nums[j] != nums[i-1]) {
            nums[i] = nums[j];
            i++;
         }
      }
      return i;
    }

   public static void main(String args[]) {
      removeDuplicate rem = new removeDuplicate();
      int [] nums = {0,0,1,1,2,2};
      int [] numsOne = {3,3,4,4,5,5};
      int result = rem.removingDuplicate(nums);
      System.out.println("unique count:" + result);
      System.out.println("Final array:");
      for(int k = 0; k < result; k++) {
        System.out.print(nums[k] + " ");
      }
   }
}