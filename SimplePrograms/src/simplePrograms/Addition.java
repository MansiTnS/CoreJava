package simplePrograms;
import java.util.*;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		a= scan.nextInt();
		System.out.println("Enter 2nd Number: ");
		b= scan.nextInt();
		c= a+b;
		System.out.println("Result = " + c);
	}

}
