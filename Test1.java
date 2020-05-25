class Test1
{
	static void m1()
		{
			int a=10;//loacal variable
			System.out.println(a);
		}
	
	public static void main(String[] args) 
	{
		int a=11;  //local variable
		System.out.println(a);
		/*
		int a=9; //local variable	
		System.out.println(a);
        Test1.java:13: error: variable a is already defined in method main(String[])
                int a=9;
                    ^
1 error
       */
		m1();
		
}
}
