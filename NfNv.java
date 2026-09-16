//Nfnv -> Normal function Normal Variable 

class NfNv
{
    static int  normalVar = 55;

    public static void callMe()
    {
        System.out.println("this is static call :" + normalVar);
    }

    int staticVar;

    public void staticCall()
    {
        System.out.println("we are calling normal variable :" + staticVar);
    }

 public static void main(String args[])
 {
   NfNv obj = new NfNv();
   callMe();
   System.out.println(normalVar);
   obj.staticCall();
   System.out.println(obj.staticVar);
 }
}
