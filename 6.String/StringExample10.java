class StringExample10{  
public static void main(String args[]){  
String name="javatpoint";  
char ch=name.charAt(4);//returns the char value at the 4th index  
System.out.println(ch);  


String name1="javatpoint";  
//if index is out of range it witll throw StringIndexOutofboundsException
char ch1=name1.charAt(10);//returns the char value at the 10th index  
System.out.println(ch1);  

}}  