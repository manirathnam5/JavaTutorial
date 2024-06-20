class TestMemberOuter {


    int data = 30;


   class InnerClass{
      
    
    void msg(){
        System.out.println("Messging from outer class " + data ) ;
    }


       

   }

}

class InnerClassExample1{


    public static void main(String[] arg){

   
       TestMemberOuter  outer = new TestMemberOuter() ;

       TestMemberOuter.InnerClass  innerClassObj = outer.new InnerClass() ;
       
       innerClassObj.msg();

    }
}