package inheritance_program;

public class n1 {
	int b=200;
	public void test2()
	{
		System.out.println("from test2");
	}
	public static void main(String[] args) {
		g2 ob1=new g2();
		System.out.println(ob1.a);
		ob1.test1();
		
		System.out.println(ob1.b);
		ob1.test2();
		System.out.println("---------------");
	}

}
