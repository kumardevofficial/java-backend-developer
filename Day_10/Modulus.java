class Modulus
{
 public static void main(String args[])
 {
	int num1 = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[1]);
	int remainderResult = remainder(num1, num2);
	System.out.println("The remainder of the given number is "+ remainderResult);
 }
 
 static int remainder(int num1, int num2)
 {
  return num1 % num2;
 }


}