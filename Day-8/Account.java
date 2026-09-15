class Account
{
 int balance = 100;
 static int intRate = 5;
 
 public static void main(String args[])
 {
	Account acc = new Account();	
	System.out.println("Balance is :" + acc.balance);
	System.out.println("Interest reat is :"+ Account.intRate);
 }
}