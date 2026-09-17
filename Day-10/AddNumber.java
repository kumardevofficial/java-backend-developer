class AddNumber 
{
 public static void main(String args[])
 {
	int num1 = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[1]);
	
	int sum = AddNumber.addTwoNumber(num1, num2);
	System.out.println("The addition of the given number is "+ sum);
 }
 
 static int addTwoNumber(int num1, int num2)
 {
	return num1 + num2;
 }

}