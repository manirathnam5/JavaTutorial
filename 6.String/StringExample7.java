class StringExample7{


    public static void main(String[] arg){


       //creating stringbuilder obj  
       StringBuilder builder = new StringBuilder("Hello") ;
       builder.append("Javaworld");

       System.out.println("Using stringbuffer obj "+builder);

       //creating stringbuffer object 

       StringBuffer buffer = new StringBuffer("Java");

       buffer.append("world");

       System.out.println("Using stringbuffer obj "+buffer);

       


    }
}