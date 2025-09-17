class RemoveElement {
   public static int[] removeElements(int[] nums,int val) {
       int count = 0;
       for(int i = 0; i < nums.length; i++) {
           if(nums[i] != va){
              nums[count]=nums[i];
              count++;
            } 
        }
        return count;
    }
    public static void main(String[] args) {
        RemoveElement rm = new RemoveElement();
        int[] nums = {1,2,4,3,5,6};
        int val = 3;
        rm.removeElements(nums,val);
    }
}
         
           