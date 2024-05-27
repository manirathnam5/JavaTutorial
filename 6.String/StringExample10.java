
//Progame to print char value if index is given outofrange it will throw StringIndexOutofBoundException
class StringExample10{  
public static void main(String args[]) throws Exception{  


    try {
   String s = "Techie worold" ;

   char c = s.charAt(13);

   System.out.println(c) ;

   }
catch(StringIndexOutOfBoundsException sie){
        System.out.println("Please give valid index");
    }
}

}  