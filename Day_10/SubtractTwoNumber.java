class SubtractTwoNumber
{
	public static void main(String args[])
	{
		int num1 =  Integer.parseInt(args[0]);
		int num2 =  Integer.parseInt(args[1]);
		int subtractResult = subtract(num1, num2);
		System.out.println("The different of the given number is "+ subtractResult);
	}
	
	static int subtract(int num1, int num2)
	{
		return num1 - num2;
	}
}