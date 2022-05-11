package vineet78;

import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select cloth type :\n1 for Mill Cloth \n2 for Handloom");
		int choice = sc.nextInt();
		
		System.out.println("Enter purchase amount of the cloth : ");
		double amt = sc.nextDouble();
		switch(choice)
		{
		case 1:
		{
			
			if(amt>=1 && amt<=100)
			{
				amt =  amt -0;
			}
			else if(amt<=200 && amt>=101)
			{
				amt = amt - (amt*5)/100;
			}
			else if(amt<=300 && amt>=210)
			{
				amt = amt - (amt*7.50)/100;
			}
			else
			{
				amt = amt - (amt*10)/100;
			}
			System.out.println("Purchase amount after Discout : "+amt);
		}
		break;
		
		case 2:
		{
			
			if(amt>=1 && amt<=100)
			{
				amt = amt - (amt*5)/100;
			}
			else if(amt<=200 && amt>=101)
			{
				amt = amt - (amt*7.50)/100;
			}
			else if(amt<=300 && amt>=210)
			{
				amt = amt - (amt*10)/100;
			}
			else
			{
				amt = amt - (amt*15)/100;
			}
			System.out.println("Purchase amount after Discout : "+amt);
			
		}
		break;
		default:
			System.out.println("Worng choice !!! ");
			
		
		}
		
		 System.out.println("\nName : Vineet Kukreti\nStudent Id : 20011316\nROll No : 78");
	}

}
