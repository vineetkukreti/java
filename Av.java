package vineet78;

import java.io.*;

import java.util.*;

class Av{

public static void main(String arg[])throws Exception{

Scanner sc=new Scanner(System.in);

InputStreamReader isr=new

InputStreamReader(System.in); BufferedReader br=new

BufferedReader(isr);

int choice;

char c='n';

int no_of_candidates;


System.out.println("Enter the no of candidates"); no_of_candidates=Integer.parseInt(br.readLine())+1;

String[] candidates_names=new String[no_of_candidates]; for(int i=0;i<no_of_candidates-1;i++){
System.out.print("Enter "+(i+1)+" candidate name: "); candidates_names[i]=br.readLine(); System.out.println("\n");

}

candidates_names[no_of_candidates-1]="NOTA"; int arr[]=new int[no_of_candidates]; for(int i=0;i<no_of_candidates;i++){

arr[i]=0;

}

int count=0;

while(c!='y'){

count++;

System.out.println("---------------Menu----------------");

for(int i=0;i<no_of_candidates;i++){

System.out.print("Press "+(i+1)+" to vote : "+candidates_names[i]+"\n");

}

int n=Integer.parseInt(br.readLine());

int k=n-1;

arr[k]++;

System.out.println("Press any key to continue and y to exit: ");
 



c=sc.nextLine().charAt(0);

}


System.out.println("Number of voters in this election: "+count);

int max=arr[no_of_candidates-1];

String winner=candidates_names[no_of_candidates-1]; int alotted_number=no_of_candidates;

for(int i=0;i<no_of_candidates-1;i++){

if(max<arr[i]){

max=arr[i];

winner=candidates_names[i];

alotted_number=i;

}

}

System.out.println("----------------Table of Election--------------");

for(int i=0;i<no_of_candidates;i++){

System.out.print(candidates_names[i]+"\t"+arr[i]+"\n");

}

System.out.println("\nThe winner of the election is: '"+ winner+"' with votes "+max);

}

}
 



