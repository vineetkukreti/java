package vineet78;

class CallT
{
	long phno;
	String sname;
	int n;
	double amt;
	CallT(long phno,String sname,int c)
	{
		this.phno = phno;
		this.sname = sname;
		n = c;
	}
	void compute()
	{
		if(n>=1&&n<=100)
			amt = 500;
		else if(n>=101 && n<=200)
			amt = 500+(n-100)*1;
		else if(n>=201 && n<=300)
		{
			n = n-200;
			amt = (500 + n*1.20+100*1.00);
		}
		else
		{
			n = n-300;
			amt = n*1.50+100*1.20+100*1.00+500;
		}
		
	}
	void display()
	{
		System.out.println("Name "+sname);
		System.out.println("Phone  "+phno);
		System.out.println("no of calls "+n);
		System.out.println("Amount  "+amt);
		
	}
}
public class Q9 {
	public static void main(String arg[])
	{
		CallT a = new CallT(12235,"Vineet KUkreti",680);
		a.compute();
		a.display();
		 System.out.println("\nName : Vineet Kukreti\nStudent Id : 20011316\nROll No : 78");
	}
}
