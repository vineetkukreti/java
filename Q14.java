package vineet78;


abstract class CardVal
{
	String s;
	abstract void validate(String s);
}
class MasterCard extends CardVal
{
	 void validate(String s)
	{
		int n = s.length();
		if(n==13)
		{
		if(s.charAt(0)=='5'&&s.charAt(1)=='1'||s.charAt(1)=='2'||s.charAt(1)=='3'||s.charAt(1)=='4'||s.charAt(1)=='5')	
		{
			System.out.println("Card is valid ,It's a MasterCard");
		}
		}
		else
		{
			System.out.println("Invalid card no. is not match with mastercard");
		}
	}
}
class AmericanExpress extends CardVal
{
	 void validate(String s)
	{
			int n = s.length();
			if(n==15)
			{
				if(s.charAt(0)=='3'&&s.charAt(1)=='4'||s.charAt(0)=='3'&&s.charAt(1)=='7')
				{
					System.out.println("Card is valid ,It's a American Express Card");
				}
			}
			else
			{
				System.out.println("Invalid card no. is not match with American Express");
			}
	}
}

class VISA extends CardVal
{
	 void validate(String s)
	{
			int n = s.length();	
			if(n==13 || n==16)
			{
				if(s.charAt(0)=='4')
				{
					System.out.println("Card is valid ,It's a Visa Card");
				}
			}
			else
			{
				System.out.println("Invalid card no. is not match with visa");
			}
	}
}

public class Q14 {

	public static void main(String[] args) {
		
			CardVal card = new VISA();
			card.validate("4111111111111111");
			card = new AmericanExpress();
			card.validate("340000000000009");// valid no 
		//	3400 0000 0000 009
			card.validate("3400000000000091");// not valid
			 System.out.println("\nName : Vineet Kukreti\nStudent Id : 20011316\nROll No : 78");
	}

}
