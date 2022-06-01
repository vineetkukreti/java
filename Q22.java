package vineet78;

class Account 
{
   int balance;
   public Account()
{
   balance=5000;
}
public synchronized void withdraw(int bal)
{
   try
     {
       Thread.sleep(1000);
     }
   catch(Exception ex)
     {
       System.out.println("EXCEPTION OCCURED.."+ex);
     }
       balance= balance-bal;
       System.out.println("Balance remaining:::" + balance);
}
}
class Amtthread implements Runnable
     {
       Account obj;
       public Amtthread(Account a)
     {
       obj=a;
     }
     public void run()
     {
        obj.withdraw(500);
     } 
}
public class Q22 
      {
          public static void main(String args[])
        {
        	System.out.println("\n\t\t***********************************");
      		System.out.println("\tDemostration of withdrawing money from same account but from differnt ATM");
      		System.out.println("\t\t***********************************");
           Account a1=new Account();
           Amtthread c1=new Amtthread(a1);
           Thread t1=new Thread(c1);
           Thread t2=new Thread(c1);
           t1.start();
           t2.start();
           System.out.println("\n\t\t***********************************");
           System.out.println("\nName : Vineet Kukreti\nStudent Id : 20011316\nROll No : 78");
   	       System.out.println("\t\t***********************************");
         }
      }

