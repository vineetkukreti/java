package vineet78;

public class Q4 {
	public static void main(String args[])
	{
		int count = 0;
		String name   = "abcd abc aabc baa abcaa\n";
		System.out.print("String : "+name);
		for(int i = 1;i<name.length();i++)
		{
			if(name.charAt(i)=='a'&&name.charAt(i-1)=='a')
			{
				count++;
			}
			
		}
		System.out.println("Count : "+count);
		 System.out.println("\nName : Vineet Kukreti\nStudent Id : 20011316\nROll No : 78");
	}
}
