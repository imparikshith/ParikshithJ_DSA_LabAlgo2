package assig2;

import java.util.Scanner;
import java.util.Arrays;
public class DriverClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations:");
		int noOfDenominations = sc.nextInt();
		
		System.out.println("Enter the currency denominations value:");
		int denominations[] = new int[noOfDenominations];
		
		for(int i = 0; i<noOfDenominations; i++)
		{
			denominations[i] = sc.nextInt();
		}
		System.out.println("Before sorting: "+Arrays.toString(denominations));
		
		InsertionSort is = new InsertionSort();
		is.sort(denominations);
		
		System.out.println("After sorting: "+Arrays.toString(denominations));
		System.out.println("Enter amount you wish to exchange:");
		int amount = sc.nextInt();
		
		NoteCount nc = new NoteCount();
		nc.counting(denominations,amount);
	}
}
