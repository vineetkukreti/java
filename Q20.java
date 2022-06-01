package vineet78;
public class Q20 {

public static void main(String[] args) {

Integer a = 0;

int count = 0;

System.out.println("---------- Demonstration of Command lineArgument ----------\n");

for(String s : args) {

System.out.println(s);

if (!(s.charAt(0) >= 65 && s.charAt(0) <= 90 || s.charAt(0)

>= 97 && s.charAt(0) <= 122)) {

a = a + Integer.parseInt(s);

}

else {

count++;

}

}

System.out.println("sum = " + a);

System.out.println("Count of invalid integers entered : " +

count + "\n");

System.out.print("\n\t\t------------------End Of The Program------------------");

System.out.println("\nName : Vineet Kukreti\nStudent Id : 20011316\nROll No : 78");

}

}
 
