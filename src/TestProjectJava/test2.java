package TestProjectJava;

public class test2 {

	
public String name;
	
	public double salary;
	
	
	public void test1(String empname)
	{
		name = empname;
		
	}
	
	public void getsal(double empsal)
	
	{
		 salary = empsal;
		
	}
	
	public void printemp()
	{
		
		System.out.println("Empname : " + name);
		System.out.println("Empsal : " + salary);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test1 obj = new test1("Neha");
		
		obj.getsal(1000);
		obj.printemp();
	}


		

	
	
}
