public class FreeDelivery {
    
    public static void main(String args[])
    {
        int payAmount = Integer.parseInt(args[0]);
        String eligiblity = payAmount >= 500 ? "Eligible" : "Not Eligible" ;
        System.out.println("You are "+ eligiblity + " for free Delivery");
    }
}
