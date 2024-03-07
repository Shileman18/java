package polymorphism_program;

public class hr extends employee {
	
	public void work()
	{
		System.out.println("i am a hr");	
	}
 public hr(int eid, String ename, double sal)
 {
	super(eid,ename,sal);
 }

}
