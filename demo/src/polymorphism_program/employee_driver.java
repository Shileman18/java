package polymorphism_program;

public class employee_driver {

	public static void main(String[] args) {
		employee e1=new developer(111,"harsha",50000000);
		employee e2=new tester(222,"dhanush",5500000);
		employee e3=new hr(333,"arun",100000000);
		employee[] ob= {e1,e2,e3};
		for(int i=0; i<3; i++) {
			ob[i].displayinfo();
			ob[i].work();
			System.out.println("---------------");
		}
	}

}
