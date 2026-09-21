class FundTransfer
{
 public static void main(String args[])
 {
  System.out.println("Starting main()");
  
  //calling the method and passing the values (input)
  boolean result = FundTransfer.doTransaction(10, "4563783786", "4798763456");
  
  System.out.println("Is txn sucessful ?" + result);
  
  System.out.println("Ending main()");
 }
 
 static boolean doTransaction(int amountToBetxn, String senderAccNo, String recAccNo)
 {
 System.out.println("Entered doTransaction()");
 
 System.out.println("Input Received"+amountToBetxn+" "+senderAccNo+" "+recAccNo);
 //some biz logic which will perform the transcation.
 
 System.out.println("Exit doTransaction()");
 
 return true;
 }
}