//importing required packages Set,Arrays

import java.util.*;
//Declaring a class

class brokenLetters {

//Declaration of method
    public static int canBeTypeWords(String text,String brokenLetters) {
        Set<Character> set = new HashSet<>();
        for(char ch:brokenLetters.toCharArray()){
           set.add(ch);
        }
        int count = 0;
        String[] words = text.split(" ");
        for(String word:words) {
           for(char ch:word.toCharArray()) {
              if(set.contains(ch)){
                  count++;
                  break;
              }
            }
         }
         return words.length-count;
      }
//Main Method
    public static void main(String args[]) {
        brokenLetters br = new brokenLetters();
        //String text = "Hello World";
        //String brokenLetters ="a,d,l";
        System.out.println(canBeTypeWords("Hello World","a,d"));
    }
}