interface Showable {


    void show ();

    interface Messagable{

        void msg();

    }

}

class Testclass implements Showable,Showable.Messagable{


    public void msg(){
        System.out.println("am messaging ") ;
    }


    public void show(){
        System.out.println("am showing ") ;
    }
}


class InnerClassExample4{

   public static void main(String[] arg ) {
 
   Showable.Messagable  obj = new Testclass();

   Showable showableObj = new Testclass();

   obj.msg();
   showableObj.show();

     }  
 }