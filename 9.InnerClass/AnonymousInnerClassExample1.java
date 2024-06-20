abstract class Person{


   abstract void eat();

}


class AnonymousInnerClassExample1 {


    public static void main(String[] args) {

       Person p = new Person(){
       
       void eat(){
           System.out.println("I am eating ") ;
            }
       };
         
       p.eat();
    }

    }
