class Student{


    int id;

    String name ;


    public void setId(int id ){
        this.id = id;
    }


    public int getId(){
        return id ;
    }

    public void setName(String name){
        this.name = name ;
    }

    public String getName(){
        return name ;
    }


    public String getStudentInfo(){
        return  " Student ID is " + id + "  Name is " + name ;
    }
}

class EncapsulationExample1{

    public static void main(String[] arg){

     Student  obj = new Student();
     obj.setId(122 );
     obj.setName("Manish Manirathnam R") ;

     System.out.println( obj.getStudentInfo()) ;


    }
}