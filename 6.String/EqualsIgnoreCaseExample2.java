import java.util.ArrayList;
import java.util.List;

class EqualsIgnoreCaseExample2{

  
      public static void main(String[] arg) {


         String str1 = "RAJ";

        List<String>  nameList = new ArrayList<String>();

        nameList.add("Nickel") ;
        nameList.add("Raj");
        nameList.add("Suresh");
        nameList.add("Sainthavi");
        nameList.add("Santhos");


         for(String  s: nameList){

            if(s.equalsIgnoreCase(str1)){
                System.out.println("yes Raj is found in name  list ") ;

            }
           
         }


         String str2 = "Mukesh Kumar";  
        ArrayList<String> list = new ArrayList<>();  
        list.add("Mohan");   
        list.add("Mukesh");  
        list.add("RAVI");  
        list.add("MuKesH kuMar");  
        list.add("Suresh");  
        
        for (String str : list) {  
            if (str.equalsIgnoreCase(str2)) {  
                System.out.println("Mukesh kumar is present");  
            }  
        }  


        
      }

    
}