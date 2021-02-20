package javaStringProject;

import java.util.Scanner;

public class Palindromes {
	public static void main(String args[]) {
       Scanner input = new Scanner(System.in);
       String str = input.nextLine();
       String reversed = reverse(str);
       boolean isPalindrome = isPalin(str);
       System.out.println("the reversed string is " +reversed);
       System.out.println("Is the string a palindrom ? " +isPalindrome);
    }
	
    public static String reverse(String str) {
    	String lower = str.toLowerCase();
    	char[] array = lower.toCharArray();
    	int start = 0, end = array.length-1;
    	while(start < end) {
    		char temp = array[start];
    		array[start] = array[end];
    		array[end] = temp;
    		start++;
    		end--;
    	}
    	
    	String reversed = new String(array);
    	return reversed;
    	
    	
    }
    
    public static boolean isPalin(String str) {
    	String lower = str.toLowerCase();
    	int start = 0, end = lower.length()-1;
    	while(start < end) {
    		if(lower.charAt(start) != lower.charAt(end)) {
    			return false;
    		}
    		start++;
    		end--;
    	}
    	return true;
    }
}
