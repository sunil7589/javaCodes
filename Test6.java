class Test6 
{
	int a=100,b=200;
	static int c=100,d=200;
	void m1()
		{
			System.out.println(a);
			System.out.println(b);	
			System.out.println(Test6.c);	
			System.out.println(Test6.d);
	    }
	static void m2()
	{
		Test6 t=new Test6();
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(Test6.c);
		System.out.println(Test6.d);
	}
	public static void main(String[] args) 
	{
		Test6 t= new Test6();
		t.m1();
		Test6.m2(); //m2();
	}
}
