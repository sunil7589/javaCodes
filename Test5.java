class Test5 
{
		static int a;
	    float b;
		byte s;
		short x;
		char c;
		long l;
		double d;
		boolean z;

	public static void main(String[] args) 
	{    
       /*  int y;
		System.out.println(y);   //Before using,local variable must be initialized */
		
		Test5 t= new Test5();
		 
		System.out.println(t.a);	
		System.out.println(t.b);
		System.out.println(t.s);
		System.out.println(t.x);
		System.out.println(t.c);
		System.out.println(t.l);
		System.out.println(t.d);
		System.out.println(t.z);
		

	}
}
/*  =======jvm assigned default values of instance variables and static variables=======
             
G:\2020\practice>javac Test5.java

G:\2020\practice>java Test5
0
0.0
0
0

0
0.0
false


*/
