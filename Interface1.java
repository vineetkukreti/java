package afterMidTerm;
interface A
{
	void show();
}
interface B
{
	void run();
}
class MultipleInheritance implements A,B
{
	public void show()
	{
		System.out.println("Show function from the interface A");
	}
	public void run()
	{
		System.out.println("run function from the interface B");
	}
}
public class Interface1 {

	public static void main(String[] args) {
		
		MultipleInheritance obj = new MultipleInheritance();
		obj.run();
		obj.show();
	}

}
