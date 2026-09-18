package tools;
public class Calculator
{
	public int num1;
	public int num2;
	
	public int sum(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
		return this.num1 + this.num2;
	}
}