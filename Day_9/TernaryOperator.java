class TernaryOperator
{
 public static void main(String args[])
 {
   int minAge = 18;
   int maxAge = 60;
   
   int userAge = Integer.parseInt(args[0]);
   
   String message = minAge < userAge ? "Allowed" : "Not allowed" ;
   System.out.println(message);
 }

}