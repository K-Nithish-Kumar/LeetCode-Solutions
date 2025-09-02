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
      int [] nums = {1,1,2};
      int result = rem.removingDuplicate(nums);
      System.out.print(result);
   }
}