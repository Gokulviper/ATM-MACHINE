public class CustomerDetails {
    public boolean checkValidUser(int secretNumber){
        switch (secretNumber){
            case 2342:

                return true;
            case 4764:
                return true;
            case 1234:

                return true;
            case 6845:

                return true;
            case 7865:

                return true;
            case 7698:

                return true;
            case 2424:

                return true;
            case 4785:
                return true;
            case 7976:
                return true;
            case 9087:
                return true;
            case 6587:
                return true;
            case 1245:
                return true;
        }
        return false;
    }
    int balance;
    public int findUser(int secretNumber){
        switch (secretNumber){
            case 2342:
             balance=   customerOne();
             return balance;

            case 4764:
                balance=     customerOTwo();
                return balance;

            case 1234:
                balance=    customerThree();
                return balance;

                case 6845:
                    balance=   customerFour(); return balance;


                case 7865:
                    balance=    customerFive();
                    return balance;

                case 7698:
                    balance=   customerSix();
                    return balance;

                case 2424:
                    balance=     customerSeven();
                    return balance;

                case 4785:
                    balance=       customerEight(); return balance;

                case 7976:
                    balance=     customerNine();
                    return balance;

                case 9087:
                    balance=     customerTen(); return balance;


            case 6587:
                balance=    customerEleven();
                return balance;

            case 1245:
                balance=     customer12();
                return balance;

        }
        return 0;
    }

    public int customerOne(){
        String customerName="rajkumar";
        int accountBalance=32414;
        System.out.println("Account holder name "+customerName);
        System.out.println("current account balance "+accountBalance);
        return accountBalance;

    }
    public int customerOTwo(){
        String customerName="kumar";
        int accountBalance=50000;
        System.out.println("Account holder name "+customerName);
        System.out.println("current account balance "+accountBalance);
        return accountBalance;

    }public int customerThree(){
        String customerName="vinay";
        int accountBalance=32414;
        System.out.println("Account holder name "+customerName);
        System.out.println("current account balance "+accountBalance);
        return accountBalance;
    }public int customerFour(){
        String customerName="suresh";
        int accountBalance=672414;
        System.out.println("Account holder name "+customerName);
        System.out.println("current account balance "+accountBalance); return accountBalance;

    }public int customerFive(){
        String customerName="vignesh";
        int accountBalance=46475;
        System.out.println("Account holder name "+customerName);
        System.out.println("current account balance "+accountBalance); return accountBalance;
    }public int customerSix(){
        String customerName="raj";
        int accountBalance=324143;
        System.out.println("Account holder name "+customerName);
        System.out.println("current account balance "+accountBalance); return accountBalance;
    }public int customerSeven(){
        String customerName="hari";
        int accountBalance=32677;
        System.out.println("Account holder name "+customerName);
        System.out.println("current account balance "+accountBalance); return accountBalance;
    }
    public int customerEight(){
        String customerName="vinoth";
        int accountBalance=123589;
        System.out.println("Account holder name "+customerName);
        System.out.println("current account balance "+accountBalance); return accountBalance;
    }
    public int customerNine(){
        String customerName="pasupathi";
        int accountBalance=457568;
        System.out.println("Account holder name "+customerName);
        System.out.println("current account balance "+accountBalance); return accountBalance;
    }
    public int customerTen(){
        String customerName="rajkumar";
        int accountBalance=32414;
        System.out.println("Account holder name "+customerName);
        System.out.println("current account balance "+accountBalance); return accountBalance;
    }
    public int customerEleven(){
        String customerName="gokul";
        int accountBalance=24235235;
        System.out.println("Account holder name "+customerName);
        System.out.println("current account balance "+accountBalance); return accountBalance;
    }public int customer12(){
        String customerName="rajkumar";
        int accountBalance=6786;
        System.out.println("Account holder name "+customerName);
        System.out.println("current account balance "+accountBalance); return accountBalance;

    }


}
