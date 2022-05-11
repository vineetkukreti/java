package vineet78;

interface I1
{
	void display();
}
interface I2
{
	void show();
}
class View implements I1,I2
{
	 public void display()
	{
		System.out.println("Display details");
	}
	 public void show()
	{
		System.out.println("Show details");
	}
}
public class Q13 {

	public static void main(String[] args) {
		
		View on = new View();
		on.display();
		on.show();
		 System.out.println("\nName : Vineet Kukreti\nStudent Id : 20011316\nROll No : 78");
	}

}
