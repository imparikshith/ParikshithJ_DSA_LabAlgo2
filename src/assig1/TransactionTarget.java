package assig1;

import java.util.Scanner;
public class TransactionTarget {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of days the shop was open");
		int noOfDays = sc.nextInt();
		
		int revenue[] = new int[noOfDays];
		System.out.println("Please enter the collection for each day");
		
		for(int i = 0; i<revenue.length; i++)
		{
			revenue[i]=sc.nextInt();
		}
		System.out.println("Please enter the number of targets that needs to be achieved");
		int totalTargets = sc.nextInt();
		
		for(int i = 1; i<=totalTargets; i++)
		{
			int sum = 0;
			int flag = 0;
			System.out.println("Please enter the value of Target "+i);
			int target = sc.nextInt();
			
			for(int j = 0; j<revenue.length; j++)
			{
				sum += revenue[j];
				if(sum >= target)
				{
					System.out.println("Target achieved on day "+(j+1));
					flag = 1;
					break;
				}
			}
			
			if(flag == 0)
			System.out.println("Target not achieved");
		}
	}
}
