package vineet78;

import java.util.Arrays;
import java.util.Scanner;

public class Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s1 = sc.nextLine();
        char[] ch = s1.toCharArray();
        int index = 0;

        for (int i = 0; i < ch.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (ch[i] == ch[j])
                    break;
            }

            if (j == i)
                ch[index++] = ch[i];
        }

        System.out.println("String without the duplicates: " + String.valueOf(Arrays.copyOf(ch, index)));
        System.out.println("\nName : Vineet Kukreti\nStudent Id : 20011316\nROll No : 78");
    }
}