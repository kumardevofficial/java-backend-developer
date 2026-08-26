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




public class Main{

 public static void main(String[] args){
 Student st = new Student();
 st.setName("Birbal");
 st.setAge(35);
 st.setRollNumber(23);
 
 st.getName();
 st.getAge();
 st.getRollNumber();
 }
}