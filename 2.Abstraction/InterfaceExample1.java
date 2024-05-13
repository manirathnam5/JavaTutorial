//interface example1


interface  DemoInterface{

    int data = 10;

    void display();

}


class TestClass implements  DemoInterface {



   public void display(){


        System.out.println(" Display interface overriden method ") ;


    }


    public void testMethod(){

        System.out.println(" Test method overriden in subclass  ");
    }

}


class InterfaceExample1{

    public static void main(String[] arg ) {

        TestClass obj = new TestClass();
        obj.display();
        obj.testMethod();
    }
}




