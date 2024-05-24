//example code without overriding toString method 
class Student{

    String name ;
    int rollno;
   String collegeName;


   Student (String name , int rollno ,String collegeName){
    this.name = name ;
    this.rollno = rollno;
    this.collegeName = collegeName;

   }




}



//This program will print Student object only not string representation
public class StringExample8{

    public static void main(String[] arg){

     Student s1 = new Student("Nickel" , 44, "VIT");
     Student s2 = new Student("Mathew" ,55,"IIT");

     System.out.println(s1);

     System.out.println(s2);


    }
}