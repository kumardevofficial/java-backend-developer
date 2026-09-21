class Increment
{
	public static void main(String args[])
	{
		int num1 = Integer.parseInt(args[0]);
		int afterIncrement = incrementByOne(num1);
		System.out.println("The enter value is after one increment "+ afterIncrement);
	}
	
	static int incrementByOne(int num1)
	{
		return ++num1;
	}

}