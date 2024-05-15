interface TestInterface{

    static void show(){

        System.out.println(" static method executed ");
    }
    
     void square(int a) ;
}


class TestClass implements TestInterface{


    public void square(int a){
        System.out.println( a* a);
    }
}


class InterfaceExample7{


      public static void main(String[] arg){
      

        TestClass obj = new TestClass();
        TestInterface.show();
        obj.square(8);


      }
    
}