package vineet78;
class ThreadOne implements Runnable
{
public void run()
{
int i;for(i=1;i<=20;i+=2)
{
System.out.println("odd number:"+i);
}
}
}
class ThreadTwo implements Runnable
{
public void run()
{
int i;for(i=2;i<=20;i+=2)
{
System.out.println("even number:"+i);
}
}
}
public class Q21
{
public static void main(String args[])
{
System.out.println("\n\t\t***********************************");
System.out.println("\tDemostration of multiple interface using interface");
System.out.println("\t\t***********************************");
ThreadOne t1=new ThreadOne();
ThreadTwo t2=new ThreadTwo();
Thread c1=new Thread(t1);
Thread c2=new Thread(t2);
c1.start();
c2.start();
System.out.println("\n\t\t***********************************");
System.out.println("\nName : Vineet Kukreti\nStudent Id : 20011316\nROll No : 78");	    System.out.println("\t\t***********************************");
}
}
