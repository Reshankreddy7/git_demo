class JavaSample
{
	public static void main(String args[])
	{
		System.out.println("Hello");
		System.out.println("Sum="+sum(10,20,30));
		System.out.println("Product="+multiply(10,20));
		System.out.println("Division="+divide(20,10));
		System.out.println("Division="+sum(20,10,40));

	}

	public int sum(int a, int b, int c)
	{
		int c= a+b+c;
		return c;
	}

	public multiply(int a, int b)
	{
		int c=a*b;
		return c;
	}
	public double divide(int a,int b)
	{
		double c=a/b;
		return c;
	}
	public sum(int a, int b, int c)
	{
		int d=a+b+c;
		return d;
	}
}