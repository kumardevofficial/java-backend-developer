public class TransactionCharges {
    
    public static void main(String args[])
    {
        int payableAmount = Integer.parseInt(args[0]);
        String message = payableAmount >= 2000 ? "3% charge" : "No charges";
        System.out.println("You need to pay "+ message + " for this payment");
    }
}
