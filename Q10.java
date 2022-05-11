package vineet78;

import java.util.Scanner;

public class Q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of objects to be made: ");
        int t = sc.nextInt();
      
        Student[] arr = new Student[t];
        
        for (int i = 0; i < t; i++) {
            System.out.println("Name: ");
            String name = sc.next();

            Student s1 = new Student(name, i);
            arr[i] = s1;
        }
        System.out.println("\nName : Vineet Kukreti\nStudent Id : 20011316\nROll No : 78");
    }
}

class Student{
    String name;
    int age;
    Student(String a, int b){
        this.name = a;
        this.age = b;
   
    }
}
