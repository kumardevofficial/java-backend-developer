class SecondPayment
{
 
 int totalBlance = 2100; // instance variable --> belong to object
 static int maxAmount = 1000; // static variable --> belong to class
 public static void main(String args[])
 {
  int balance; // local variable
  balance = 200;
  int amountToBeTxn = 12;
  System.out.println("Balance is :"+ balance);
  System.out.println("Transcation amount :"+ amountToBeTxn);
  
  SecondPayment sp = new SecondPayment();
  sp.doSomething();
  sp.doNothing();
  saySomething();
 }
	
	public void doSomething()
	{
		System.out.println("This is do something method...");
	}
	
	public void doNothing()
	{
		System.out.println("This is do nothing method...");
	}
	public static void saySomething()
	{
		System.out.println("just say something ");
	}
}