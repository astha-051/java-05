import java.util.*;

class MyBank{
    int accNum;
    String accType;
    double balance;
    MyBank(){ // constructor
    this.balance=20000;
    }
    MyBank(int accNum,String accType, double balance){ // paramatrized constructor
    this.accNum=accNum;
    this.accType=accType;
    this.balance=balance;
    }
    void creditAmt(double amt){ //method
        this.balance=this.balance+amt;
        System.out.println("credited amt="+amt);
        }
    void debitAmt(double amt){ //method
            this.balance=this.balance-amt;
            if((this.balance=balance-amt)<=20000)
            {
                System.out.println("sorry!! you cannot debit from this acc");
            }
            else{
             System.out.println("debited balance="+balance);   
            }
        // System.out.println("debited amt="+amt);
        }
    void displayBal(){ //method
        System.out.println("Your balance is ="+balance);
        }
}
public class asign3{
    public static void main(String[] args) {
        System.out.println("TO CHECK BALANCE=1");
        System.out.println("TO CREDIT_BALANCE=2");
        System.out.println("TO DEBIT_BALANCE=3");
        System.out.println("TO EXIT=4");
        Scanner sc =new Scanner (System.in);
        MyBank mb1=new MyBank(2222,"saving",20000); 
        int num;
        
        for(; ;)
        {
            System.out.println("ENTER A NUMBER:");
            num= sc.nextInt();
            switch (num)
            {
                case 1: 
                    mb1.displayBal();
                    break;
                case 2:
                    System.out.print("Enter credit amount: ");
                    double creditAmount = sc.nextDouble();
                    mb1.creditAmt(creditAmount);
                    mb1.displayBal();
                    break;
                case 3:
                System.out.print("Enter debit amount: ");
                    double debitAmount = sc.nextDouble();
                    mb1.debitAmt(debitAmount);
                    mb1.displayBal();
                    break;
                case 4: 
                    System.exit(0);
                    break;
            }
}
}
}