//program to print char at odd position
class StringExample12{

    public static void main(String[] arg){

     String str = "Welcome";

     char[] ch = str.toCharArray();

     for(int i = 0;i<ch.length;i++){
           if(i%2 == 1){
            System.out.print(ch[i]+" ");
           }
     }

    }
}