public class Test2 
{
	int _a=100,$b=200;//instance variables
	public static void main(String[] args) 
	{
		Test2 t=new Test2();   //object creation
		System.out.println(t._a);  // t is a reference varaiable	
		System.out.println(t.$b);
		t.m1();
	}
	void m1()
	{
	System.out.println(_a);
	System.out.println($b);
	}
}

