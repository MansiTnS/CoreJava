package simplePrograms;
import java.util.*;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isVowel = false;
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character:");
		ch= scan.next().charAt(0);
		scan.close();
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': isVowel = true;
		}
		if(isVowel == true) {
			System.out.println(ch + " is a vowel");
		}
		else { 
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
				System.out.println(ch+" is a Consonant");
			   else
				System.out.println("Input is not an alphabet");	
			}
		
		}
	}

