
interface Bank{

    void withdraw();

    void deposit();

    void loan();

    void account();

}


abstract class Dev1  implements Bank{

    public void withdraw(){

        System.out.println("Withdraw amount from Bank ") ;
    }
}


abstract class Dev2  extends Dev1{

    public void deposit(){

        System.out.println("Amount is depositted ") ;
    }
}


class SavingsAccount  extends Dev2{

    public void loan(){
       
        System.out.println("Loan amount sanctioned ") ;

    }


    public void account(){

        System.out.println("Account is created");
    }
}



class InterfaceExample5 {


    public static void main(String[] arg) {


        Bank obj = new SavingsAccount();

        obj.deposit();
        obj.withdraw();
        obj.loan();
        obj.account();

    }
}

