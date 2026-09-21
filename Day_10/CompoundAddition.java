class CompoundAddition
{
	public static void main(String args[])
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int afterAdditon = compoundAddition(num1 , num2);
		System.out.println("The result after compound addition"+ afterAdditon);
	}
	static int compoundAddition(int num1, int num2)
	{   num1 +=num2;
		return num1 ;
	}
}