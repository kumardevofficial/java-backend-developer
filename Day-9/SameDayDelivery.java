 class SameDayDelivery {
   
    public static void main(String args[])
    {
        // we are taking input 0 and 1 , for 1 mean yes and 0 means no for the prime user
        int primeUser = Integer.parseInt(args[0]);
        String eligibility = primeUser == 1 ? "Eligible" : "Not eligible";
        System.out.println("You are "+ eligibility+" for same day delivery");
        
    }
}
