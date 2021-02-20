package javaStringProject;
import java.util.Scanner;

public class LastLetterCount {
   public static void main(String args[]) {
	   
	   Scanner input = new Scanner(System.in);
	   String str = input.nextLine();
	   String lower = str.toLowerCase();
	   String firsts = null;
	   String firsty = null;
	  
	   for(int i = 0; i < lower.length(); i++) {
		   if(lower.charAt(i) == 's') {
			   if(firsts == null) {
				   firsts = lower.substring(0,i+1);
			   }
			   
		   }else if(lower.charAt(i) == 'y') {
			   if(firsty == null) {
			   firsty = lower.substring(0, i+1);
		   }
		   }
		  
	   }
	   System.out.println("there are two words swapped: " +firsts + " and " + firsty);
   }
}
