package polymorphism_program;

public class developer extends employee{
	
	public void work()
	{
	System.out.println("i am a developer");	
	}
 public developer (int eid, String ename, double sal)
 {
	 super(eid, ename, sal);
 }

}
