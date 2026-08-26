class Student{
 private String name;
 private int age;
 private int rollNumber;
 
 public void setName(String name){
	this.name = name;
 }
 public void setAge(int age){
   if(age > 5 && age < 100){
   this.age = age;
   } else {System.out.println("the age you enter is"+ age + "and it's should be greater then 5 year and less then 100 year ");}
 }
 public void setRollNumber(int rollNumber){
  this.rollNumber = rollNumber;
 }
 
 public void getName(){
  System.out.println(this.name);
 }
 public void getAge(){
  System.out.println(this.age);
 }
 public void getRollNumber(){
 System.out.println(this.rollNumber);
 }
}

class BankAccount{
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	public int getAccountNumber(){
		return this.accountNumber;
	}
	
	public String getAccountHolderName(){
		return this.accountHolderName;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public void deposit(double amount){
		this.balance = balance + amount;
	}
	
	public void withdraw(double withdraw){
		if(balance >= withdraw){
			this.balance = balance - withdraw;
		} else {
			System.out.println("You do not have a sufficient balance");
		}
	}
	
	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}
	public void setAccountHolderName(String accountHolderName){
		this.accountHolderName = accountHolderName;
	}
	
}




public class Main{

 public static void main(String[] args){
 //Student st = new Student();
 //st.setName("Birbal");
 //st.setAge(35);
 //st.setRollNumber(23);
 //
 //st.getName();
 //st.getAge();
 //st.getRollNumber();
 
 BankAccount ac = new BankAccount();
 ac.setAccountNumber(64859375);
 ac.setAccountHolderName("Vikash Pathak");
 ac.deposit(5500.60);
 
 System.out.println(ac.getAccountHolderName());
 System.out.println(ac.getAccountNumber());
 System.out.println(ac.getBalance());
 ac.withdraw(600);
 System.out.println(ac.getBalance());
 
 }
}