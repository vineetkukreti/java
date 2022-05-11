package vineet78;
class A1
{
	int a = 45;
	void fun()
	{
		System.out.println("Hello A1");
	}
}
class B1 extends A1
{
	int a = 89;
	void fun()
	{
		System.out.println("Hello B1");
	}
	void show(int a)
	{
		//super.show();
		System.out.println("Show of B1     : "+a);
		System.out.println("Show true B1   : "+this.a);
		System.out.println("Show parent A1 : "+super.a);
		super.fun();
		fun();
	}
}
public class Q12 {

	public static void main(String[] args) {
		
		B1 ob = new B1();
		ob.show(23);
		 System.out.println("\nName : Vineet Kukreti\nStudent Id : 20011316\nROll No : 78");
		
	}

}
