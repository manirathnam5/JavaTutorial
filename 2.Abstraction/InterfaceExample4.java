/* */
interface  A{

    void method1();

}

 interface B extends A{

    void method2();

    void method3();

 }


 class Demo implements B{


    public void method1(){
        System.out.println(" I am method1 ") ;

    }


    public  void method2(){

        System.out.println(" I am method2");
    }

    public void method3(){
        System.out.println(" I am method3 ");
    }
 }
 



class InterfaceExample4{


    public static void main(String[] args){

        Demo  obj = new Demo();
       
        obj.method1();
        obj.method2();
        obj.method3();

    }
}