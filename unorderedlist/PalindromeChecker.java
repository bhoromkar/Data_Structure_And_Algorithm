package com.bridgelabz.datastructure.unorderedlist;
import java.util.*;
public class PalindromeChecker {
   /// example, radar, toot, and madam.
    public void palindromeChecker(String str) {
        String revStr;
        revStr = "";
        ArrayDeque<Character> arrayDeque = new ArrayDeque<>();

        for (int i =str.length()-1; i >=0; i--) {
            arrayDeque.add(str.charAt(i));

        }
        while (!arrayDeque.isEmpty()){
            revStr=revStr+arrayDeque.remove();
        }
        System.out.println(" revesre string is " + revStr);
        if (str.equals(revStr))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");
    }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      String str = sc.next();
      PalindromeChecker m = new PalindromeChecker();
      m.palindromeChecker(str);
    }
}
