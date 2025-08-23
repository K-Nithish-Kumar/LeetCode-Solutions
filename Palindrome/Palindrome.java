class Palindrome {
  public boolean isPalindrome(int x) {
     int temp = x;
     int rev = 0;
     while(x>0) {
        int digits = x%10;
        rev = (rev*10)+ digits;
        x /= 10;
     }
     if( rev == temp) {
       return true;
     }
     return false;
  }
  public static void main(String args[]) {
     Palindrome check = new Palindrome();
     System.out.println(check.isPalindrome(121));
     System.out.println(check.isPalindrome(123));
     boolean result = check.isPalindrome(1551);
     System.out.println(result);

    
  }
}