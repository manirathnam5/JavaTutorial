// Program examples for concat, contains for different scenairos
class StringExample14{

    public static void main(String[] arg){

String s1 = "what do you do now developer";

boolean s = s1.contains("developer") ;

 System.out.println(s);


 String myname="Jondy Rhodes";

 System.out.println("is name ends with rhodes  "+myname.endsWith("des"));

        
 //if you pass null object in contains method it throw nullpointer exception
try{
 boolean s2 = s1.contains(null );

 System.out.println(s2);
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