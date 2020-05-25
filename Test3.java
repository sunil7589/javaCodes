class Test3 
{
	static int a=200,b=300;//static variables
	public static void main(String[] args) 
	{
	  	System.out.println(Test3.a);   //by using classname
		System.out.println(Test3.b);   //by using classname

		System.out.println(a);	//direct access
		System.out.println(b);  // direct access
		Test3 t= new Test3();
         System.out.println(t.a);    //by object reference variable
		 System.out.println(t.b);      //by object reference variable

         t.m1();  //calling instance method in static area

	}


	void m1()
	{
		System.out.println(Test3.a);	  	
		System.out.println(Test3.b);
	}
}
