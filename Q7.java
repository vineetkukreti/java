package vineet78;

import java.util.*;
class Q7{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		int choice;
		char c='n';
		int no_of_candidates;
	
		System.out.println("Enter the no of candidates");
		no_of_candidates=sc.nextInt();
		
		int arr[]=new int[no_of_candidates];
		for(int i=0;i<no_of_candidates;i++){
			arr[i]=0;
		}
		int count=0;
		while(c!='y'){
			count++;
			System.out.println("---------------Menu----------------");
			System.out.println("Press 1 to vote Rahul\nPress 2 to vote Aviral\nPress 3 to vote Kartik k\nPress 4 to vote Vineet\nPress 5 to vote Manav\nand Press 6 to vote NOTA");
			int n=sc.nextInt();
			int k=n-1;
			arr[k]++;
			
			System.out.println("Press any key to continue and y to exit: ");
			c=sc1.next().charAt(0);
		}
		
		System.out.println("No of voters in this election: "+count);
		int max=arr[5];
		int winner=5;
		for(int i=0;i<no_of_candidates-1;i++){
			if(max<arr[i]){
				max=arr[i];
				winner=i;
			}
		}
		System.out.println("----------------Table of Election--------------");
		System.out.print("\nRahul	Aviral Karti k	Vineet	Manav	NOTA\n");
		
		for(int i=0;i<no_of_candidates;i++){
			System.out.print(arr[i]+"	");
		}
		if(winner==0){
			System.out.print("\nThe winner of the election is: Rahul"+arr[winner]);
		}
		if(winner==1){
			System.out.print("\nThe winner of the election is: Aviral"+arr[winner]);
		}
		if(winner==2){
			System.out.print("\nThe winner of the election is: Kartik k"+arr[winner]);
		}
		if(winner==3){
			System.out.print("\nThe winner of the election is: Vineet"+arr[winner]);
		}
		if(winner==4){
			System.out.print("\nThe winner of the election is: Manav"+arr[winner]);
		}
		if(winner==5){
			System.out.print("\nThe winner of the election is: No one(NOTA)"+arr[winner]);
		}

		 
	
	}
}
