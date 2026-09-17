class CompoundSubtraction 
{
	public static void main(String args[])
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int afterSubtraction = CompoundSubtraction.compoundSubtraction(num1, num2);
		System.out.println("The result of after compound subtraction"+ afterSubtraction);
	}
	
	static int compoundSubtraction(int num1, int num2)
	{
	   num1 -= num2;
	   return num1;
	}

}