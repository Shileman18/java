package encapsulation_programs;

public class m2 {

	public static void main(String[] args) {
		m1 ob=new m1();
		System.out.println(ob.read());
		ob.write(200);
		System.out.println(ob.read());

	}

}