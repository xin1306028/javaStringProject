package javaStringProject;
import java.util.Scanner;

public class Consonants {
  public static void main(String args[]) {
	  Scanner input = new Scanner(System.in);
	  String str = input.nextLine();
	  char[] array = str.toLowerCase().toCharArray();
	  int count = 0;
	  for(int i = 0; i < str.length(); i++) {
		  if(array[i] != 'a' && array[i] != 'e' && array[i] != 'i' && array[i] != 'o' && array[i] != 'u') {
			  count++;
			  array[i] = '*';
		  }
	  }
	  System.out.println("there are " + count + " consonant in the sentence" );
	  System.out.println("the new string is " +String.valueOf(array));
  }
}
