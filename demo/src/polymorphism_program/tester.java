package polymorphism_program;

public class tester extends employee {
	
	public void work()
	{
		System.out.println("i am a tester");		
	}
 public tester(int eid, String ename, double sal)
 {
	 super(eid,ename,sal);
 }

}
