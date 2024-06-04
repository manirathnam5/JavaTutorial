import java.io.*;

class TryCatchExample7{

    public static void main(String[] arg ) {

    
        PrintWriter pw ;


        try{

            pw = new PrintWriter("a.txt");
            pw.println("saved") ;
        }
        catch(FileNotFoundException ff){
            System.out.println(ff) ;
        }
     
        System.out.println("File saved successfully ") ;

    }
}