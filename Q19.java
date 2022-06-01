package vineet78;

public class Q19{  
	  void m(){  
	    int data=50/0;  
	  }  
	  void n(){  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){
		  System.out.println("\n\t\t***********************************");
			System.out.println("\tDemostration of Checked & Unchecked Exception Propagation");
			System.out.println("\t\t***********************************");
	   Q19 obj=new Q19();  
	   obj.p();  
	   System.out.println("normal flow...");
	   System.out.println("\n\t\t***********************************");
	   System.out.println("\nName : Vineet Kukreti\nStudent Id : 20011316\nROll No : 78");
	   System.out.println("\t\t***********************************");
	  }  
	} 
