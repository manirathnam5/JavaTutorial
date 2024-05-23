import java.util.Arrays;

class StringExample5{

    public static void main(String[] arg) {
   

        String str = "HelloMy name isSachin";

         String[] sentences = str.split("\\s");      
   
           for(String a : sentences){
            System.out.println(a);
           }

        // System.out.println(Arrays.toString(sentences)) ;
         
    }
}