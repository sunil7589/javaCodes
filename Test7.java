class Test7 
{
	int a=100;
	static int b=200;
	public static void main(String[] args) 
	{
		Test7 t= new Test7();
		System.out.println(t.a);
		System.out.println(t.b);		//System.out.println(b);  //valid
		t.a=188;
		t.b=999;
		System.out.println(t.a);
		System.out.println(t.b);
		Test7 t1=new Test7();	
		System.out.println(t1.a);//new value(first value) for every new object cretaion
		System.out.println(t1.b);//last value or current value

	}
}
/*=========output=======

G:\2020\practice>javac Test7.java

G:\2020\practice>java Test7
100
200
188
999
100
999

G:\2020\practice>

*/



