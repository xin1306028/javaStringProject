package javaStringProject;
import java.util.Scanner;

public class Vowels {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		int count = countVowels(sentence);
		System.out.println("number of Vowels is " +count);
	}
	
	public static int countVowels(String sentence) {
		String lower = sentence.toLowerCase();
		int count = 0;
		for(int i = 0; i < sentence.length(); i++) {
			char letter = lower.charAt(i);
			if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
				count++;
			}
		}
		return count;
		
	}
  
}


