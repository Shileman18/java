package polymorphism_program;

public class bank_driver {
	public static void main (String[] args)
	{
		Bank ob1=new icici();
		Bank ob2=new hdfc();
		Bank ob3=new axis();
		System.out.println(ob1.rateofinterest());
		System.out.println(ob2.rateofinterest());
		System.out.println(ob3.rateofinterest());
		
	}


}
