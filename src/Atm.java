import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        CustomerDetails cd=new CustomerDetails();
        System.out.println("welcome to BG atm service");
        System.out.println("please enter your 4 digit secret number");
        Scanner sc=new Scanner(System.in);
        int pin;

        int wrongCount=3;
        while(true) {
              pin    = sc.nextInt();

            if (pin < 999 || pin > 10000) {
                System.out.println("enter 4 digit only");  //if you enter 3 or 2 or one or more then 4
                continue;
            } else if (!cd.checkValidUser(pin)) { //wrong enter pin
                wrongCount--;
                if (wrongCount == 0) {
                    System.out.println("you are react the limit of enter wrong pin go and visit the bank");
                    break;
                }
                System.out.println("pin number is wrong only " + wrongCount + " chance is available otherwise your account will be stopper");
            } else {
                break;

            }
        }
        if (wrongCount==0)return;   //this for wrong pin number so totally break the program
        int DebitCount=3;
        int balance = cd.findUser(pin);

        while (true){

            System.out.println("today 3 times debit are allowed your today allow limit remaining is "+ DebitCount);
                System.out.println("press 1 for debit ");
                System.out.println("press 2 for credit ");
            System.out.println("press 0 for exit");
                int creditOrDebit=sc.nextInt();
                if(creditOrDebit>2){
                    System.out.println("enter 1 or 2");
                    continue;
                }else if(creditOrDebit==1){
                    int DebitCharge=0;
                    if (DebitCount<=0){
                        System.out.println("you are debit chances are over if you want a again debit debit charge 30 for every transaction");
                  DebitCharge=30;
                    }
                    DebitCount--;
                    System.out.println(" enter the money you want to debit ");
                    int amount=sc.nextInt();
                    if(amount>balance){
                        System.out.println("sorry insufficient balance  ");
                        return;
                    }
                   balance=Math.abs(amount-balance-DebitCharge);
                    if(balance<500){
                        System.out.println("your account reached limited amount please maintain balance above 500");
                    }

                    System.out.println("amount debited successFully  "+
                    "\n your current account balance is \n "+balance);

                    System.out.println("press 1 for continue your process");
                   System.out.println("press 2 or greater then 2  for exit");
                    int continuee= sc.nextInt();
                    if (continuee==1){
                        continue;
                    }else{
                        System.out.println("thanks for visiting our atm service");
                        return;
                    }


                }else if(creditOrDebit==2){
                    System.out.println(" enter the money you want to credit  ");
                    int amount=sc.nextInt();
                   balance=amount+balance;
                    System.out.println("amount deposited successFully  "+
                            "\n your current account balance is \n "+balance);

                    System.out.println("press 1 for continue your process");
                    System.out.println("press 2 or greater then 2  for exit");
                    int continuee= sc.nextInt();
                    if (continuee==1){
                        continue;
                    }else{
                        System.out.println("thanks for visiting our atm service");
                        return;
                    }
                }
                else{
                    break;
                }

            }

        }
    }

