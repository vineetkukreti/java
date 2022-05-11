package vineet78;
class Ob
{
	static int i = 0;
	String a;
	void setdata(String name)
	{
		a = name;
	}
	void display()
	{
		System.out.println(a);
	}
}
public class ArrayObject11 {

	public static void main(String[] args) {
		
		Ob a[] = new Ob[3];
		a[0] = new Ob();
		a[1] = new Ob();
		a[2] = new Ob();
		a[0].setdata("vineet");
		a[0].display();
		
		a[1].setdata("asd");
		a[1].display();
		
		a[2].setdata("5674");
		a[2].display();
		
		}

}
