package inheritance_program;

public class g2 extends g1{
		int b=200;
		public void test2()
		{
			System.out.println("from test2");
		}
		public static void main(String[] args) {
			g1 ob1=new g);//upcasting
			System.out.println(ob1.a);
			ob1.test1();
			System.out.println("---------------");
			g2 ob2=(g2) ob1;//downcasting
			System.out.println(ob2.b);
			ob2.test2();
		}
	}


