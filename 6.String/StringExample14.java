// Program examples for concat, contains , equals for different scenairos
class StringExample14{

    public static void main(String[] arg){

 String s1 = "what do you do now developer";

 boolean s = s1.contains("developer") ;

 System.out.println(s);


 String myname="Jondy Rhodes";

 System.out.println("is name ends with rhodes  "+myname.endsWith("des"));

 System.out.println("is name starts with jondy " + myname.startsWith("ma"));

        
 //if you pass null object in contains method it throw nullpointer exception
try{
 


 String s3 = "Welcome" ;

 String s4 = "Welcome";

 System.out.println("Using equals method "+s3.equals(s4));

 System.out.println("Using == method "+s3 == s4 ) ;

 //length method 

 String s5 = "Welcome";

 System.out.println(s5.length());


 String s6 = "Helloworld" ;

 System.out.println(s6.length()) ;
 

}
catch(Exception e){
    System.out.println("Please give valid input for contains ");
}       
       //small  use case for contains method  
       
       String username = "Raj, Suresh , Manoj";

       if(username.contains("Suresh")){
        System.out.println("user is found ");
       }else{
        System.out.println("user not found ");

       }

       

    }
}