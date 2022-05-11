package vineet78;

import java.util.Scanner;

public class Q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sub1 = new int[10];
        int[] sub2 = new int[10];
        int[] sub3 = new int[10];
        int[] sub4 = new int[10];
        int[] highest = new int[4];

        System.out.println("Enter marks of subject 1: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Mark of student " + (i+1) + ": ");
            int a = sc.nextInt();
            sub1[i] = a;
        }
        System.out.println("Enter marks of subject 2: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Mark of student " + (i +1)+ ": ");
            int a = sc.nextInt();
            sub2[i] = a;
        }
        System.out.println("Enter marks of subject 3: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Mark of student " + (i+1) + ": ");
            int a = sc.nextInt();
            sub3[i] = a;
        }
        System.out.println("Enter marks of subject 4: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Mark of student " + (i+1) + ": ");
            int a = sc.nextInt();
            sub4[i] = a;
        }

        marks(sub1, sub2, sub3, sub4);

        highest[0] = high(sub1);
        highest[1] = high(sub2);
        highest[2] = high(sub3);
        highest[3] = high(sub4);

        greatest(highest);
    }

    public static void greatest(int[] arr) {
        int great = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > great){
                great = arr[i];
            }
        }

        System.out.println("Highest marks out of all subject is: " + great);
    }

    public static int high(int[] arr) {
        int great = arr[0];
        int roll = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > great){
                great = arr[i];
                roll = i;
            }
        }

        System.out.println("Highest marks is " + great + " and Roll no. is: " + roll);
        return great;
    }

    public static void marks(int[] sub1, int[] sub2, int[] sub3, int[] sub4){
        System.out.println("Total marks for each student: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + i + ": ");
            System.out.println(sub1[i] + sub2[i] + sub3[i] + sub4[i]);
           
        }
        System.out.println("\nName : Vineet Kukreti\nStudent Id : 20011316\nROll No : 78");
    }
}