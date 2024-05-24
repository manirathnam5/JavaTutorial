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


   public String toString(){

    return name +" " + rollno +" " + collegeName ;

   }


}



//This program will print Student object in  string representation because we override toString()method 
public class StringExample9 {

    public static void main(String[] arg){

     Student s1 = new Student("Nickel" , 44, "VIT");
     Student s2 = new Student("Mathew" ,55,"IIT");

     System.out.println(s1);

     System.out.println(s2);


    }
}