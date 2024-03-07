package inheritance_program;

public class p3 {
 int c=300;
 public void test3()
 {
	 System.out.println("from test3");
 }
	public static void main(String[] args) {
		p1 ob1=new p1();
		System.out.println(ob1.a);
		ob1.test();
		System.out.println("-----------");
		p2 ob2=new p2();
		System.out.println(ob2.b);
		ob2.test2();
		System.out.println("--------");
		p3 ob3=new p3();
		System.out.println(ob3.c);
		ob3.test3();
		System.out.println("-----------");
		
	}

}
