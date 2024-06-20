class TestOuter{


    static int date = 320;

    String msg = "Hello" ;


    static class InnerClass{

        static void print(){
            System.out.println(date);
            
        }
    }
}

class InnerClassExample3{

    public static void main(String[] arg) {


        TestOuter.InnerClass  obj = new TestOuter.InnerClass();

        obj.print();
        
    }

  }