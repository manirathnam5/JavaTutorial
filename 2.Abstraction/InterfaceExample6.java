interface TestInterface{

    default void defaultMethod(){
        System.out.println(" Default method in Interface");
    }



    void show();
} 


class TestClass implements TestInterface{

   public void show(){
        System.out.println(" Show method from Testclass ");
    }

    public void defaultMethod(){

        System.out.println("Overriding the default method ");
    }
}

class InterfaceExample6 {

    public static void main(String[] arg){

        TestClass obj = new TestClass();
        obj.show();
        obj.defaultMethod();
    }
}

