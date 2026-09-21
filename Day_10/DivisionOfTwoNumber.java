class DivisionOfTwoNumber
{
	public static void main(String args[])
	{
	 int num1 = Integer.parseInt(args[0]);
	 int num2 = Integer.parseInt(args[1]);
	 int divisionResult = division(num1, num2);
	 System.out.println("The division of the given number is "+divisionResult);
	
	}
	
	static int division(int num1, int num2)
	{
	return num1 / num2;
	
	}


}