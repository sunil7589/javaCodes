class Test4 
{
	int a=5,b=6; // instance variables
	static void m1()
	{ 
		Test4 t=new Test4();
		System.out.println(t.a); 
		System.out.println(t.b);
	}
	static void m2()
	{
		Test4 t=new Test4();
		System.out.println(t.a); 
		System.out.println(t.b);
	}
	public static void main(String[] args) 
	{
		Test.m1();    //m1();
		Test.m2();    //m2();
	}
}
