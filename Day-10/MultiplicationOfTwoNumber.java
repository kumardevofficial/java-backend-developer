class MultiplicationOfTwoNumber
{

	public static void main(String args[])
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int multiplicationResult = multiplication(num1, num2);
		System.out.println("The product of the given number is"+ multiplicationResult);
	}
	
	static int multiplication(int num1, int num2)
	{
	 return num1 * num2;
	}

}