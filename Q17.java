package vineet78;

import java.util.*;

import java.io.*;

class Simple{

void m() throws IOException{

System.out.println("Device error");

}

void n() throws IOException{

m();

}

void p(){

try{

n();

}

catch(Exception e){

System.out.print("Exception Handled");

}

}

}

class CustomException extends Exception{

int age;

CustomException(int a){

age = a;

}

public String toString(){

return "Age Cannot be negative" + " " + age + "\n";

}
 
 

}

class Handler extends Exception{

void check(int a,int b){

try{

int c = a/b;

if(b > 0){

System.out.println("Answer is: " + c);

}

else{

ArithmeticException e6 = new ArithmeticException();

}

}

catch(ArithmeticException e1){

System.out.println("Error !!!! Division by zero attempted !!!!");

}

}

void array(int arr[]){

try{

arr[6] = 10 - 2;

}

catch(ArrayIndexOutOfBoundsException e2){

System.out.println("Error !!!! You cannot access out of the length of array !!!!");

}

}

void num(int s){

try{
 



 

s = Integer.parseInt("Hello World");

}

catch(NumberFormatException e3){

System.out.println("Error !!!! Number Format Exception Occurred");

}

}

void validate(int age){

try{

if(age > 0){

System.out.println("Age of the person: " + age);

}

else{

CustomException c = new CustomException(age); throw c;

}

}

catch(CustomException c){

System.out.print(c);

}

}

void parent(String str){

try{

System.out.print(str);




}

catch(Exception e4){

System.out.println("Exception Handled by ");
 


 

}

}

}

public class Q17{

public static void main(String arg[]){

Handler ob = new Handler();

Scanner sc = new Scanner(System.in);

int choice;

int a;

int b;

int s = 0;

int age;

String str;

int arr[] = new int[5];
System.out.println("\t\t------------------Demonstrate Checked & Unchecked Exception Propagation.------------------\n");

System.out.println("Enter 1. for Arithmetic Exception Handling");

System.out.println("Enter 2. for ArrayIndexOutOfBounds Exception Handling");

System.out.println("Enter 3. for NumberFormat Exception Handling");

System.out.println("Enter 4. for Custom Exception Handling");

System.out.println("Enter 5. for Checked IO Exception");

System.out.println("Enter 6. for any Exception Handling by Exception Class");

System.out.println("Enter 7. To Exit\n");
do{

 

System.out.println("\nEnter Choice: ");

choice = sc.nextInt();




switch(choice){

case 1:

System.out.println("Enter the two numbers");

System.out.print("Enter the first number: ");

a = sc.nextInt();

System.out.print("Enter the second number: ");

b	= sc.nextInt(); ob.check(a,b); break;
case 2:

System.out.print("Enter the elements in the array: "); int n = sc.nextInt();

for(int i=0;i<n;i++){ arr[i] = sc.nextInt();
}

ob.array(arr); break;

case 3:

System.out.print("For Number Format Exception -> "); ob.num(s);

break; case 4:
System.out.print("Enter Age of a person: "); age = sc.nextInt();
 


 

ob.validate(age);

break;

case 5:

Simple sim = new Simple();

sim.p();

break;

case 6:

System.out.print("For Null Pointer Exception by Exception Class -> ");

str = null;

ob.parent(str);

break;

}

}while(choice != 7);

System.out.print("\n\t\t------------------End Of The Program------------------");
System.out.println("\nName : Vineet Kukreti\nStudent Id : 20011316\nROll No : 78");

}

}
 

