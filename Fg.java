package vineet78;

public class Fg

{

private int priv_var=10;

protected int prot_var=20;

public int pub_var=30;

int default_var=40;

void show()

{

System.out.println("Demonstration of Access inside the class"); System.out.println("Here private member[priv_var] accessible here:"+priv_var);

System.out.println("Here protected member[prot_var] accessible here:"+prot_var);

System.out.println("Here public member[pub_var] accessible here:"+pub_var);

System.out.println("Here default member[default_var] accessible here:"+default_var);

}

public static void main(String args[])

{

Fg ob= new Fg();

ob.show();

System.out.println("********************");

System.out.println("\nName : Vineet Kukreti\nStudent Id : 20011316\nROll No : 78");

System.out.println("*********************");

}

}
 
















