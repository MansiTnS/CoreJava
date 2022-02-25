package simplePrograms;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		a= scan.nextInt();
		System.out.println("Enter 2nd Number: ");
		b= scan.nextInt();
		scan.close();
		c= a+b;
		System.out.println("Result = " + c);
	}

}
