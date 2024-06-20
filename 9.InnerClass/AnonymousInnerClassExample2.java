interface Building{


    void flatAvailable();

}


class AnonymousInnerClassExample2 {

    public static void main(String[] args){

        Building  building = new Building(){

            public void flatAvailable(){

                System.out.println("5 flats are available in our apartment ") ;
            };
        } ;

       building.flatAvailable() ;
       
       
       

    }
}