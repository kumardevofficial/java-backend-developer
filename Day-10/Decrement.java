class Decrement 
{
	public static void main(String args[])
	{
		int num1 = Integer.parseInt(args[0]);
		int afterDecrement = decrementByOne(num1);
		System.out.println("The enter value after decremen by one" + afterDecrement);
	}
	
	static int decrementByOne(int num1)
	{
		return --num1;
	
	}

}