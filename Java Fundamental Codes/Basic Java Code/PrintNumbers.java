//printing number from 1 to n

import java.util.*;

public class PrintNumbers{

  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("enter your desired number ");
   int inputNumber = sc.nextInt();
   for(int i=0; i<= inputNumber; i++){
    System.out.println(i +" ");
   }
  }

}