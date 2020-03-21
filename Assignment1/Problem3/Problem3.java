package problem3;

import java.util.Scanner;

/**
 *
 * @author Abanoub
 */
public class Problem3 {

    public static Scanner sc ;
    
    public static void main(String[] args) {

        int BALANCE1 , BALANCE2, MinimumBALANCE = 1000 , choice , value;
        sc = new Scanner(System.in);
        Account Acc1 , Acc2 ;
        

        //======================First Customer ======================
        System.out.print("Hi , Enter First Balance : ");
        BALANCE1 = sc.nextInt();
        
        if (BALANCE1 < MinimumBALANCE) {

            System.out.println("\nYou Can't make a Checking Account Because Min Balance = 1000, So You can only make a Saving Account");
             Acc1 = new SavingAccount("Abanoub", "Cairo", "01212836883");
             Acc1.makeAccount(BALANCE1,250505);
        } else {

            System.out.println("\nOk , You'll make a Saving Account ");
             Acc1 = new CheckingAccount("Abanoub", "Cairo", "01212836883");
             Acc1.makeAccount(BALANCE1,250505);
        }
        
        //-----
        System.out.print("\nIf you want to make a Deposit Enter , 1 and Deposit value\nIf you want to make a Withdrawal Enter , 2 and Withdrawal value\nChoice :");
        if(sc.nextInt()==1){ 
            System.out.print("Value : ");
            Acc1.makeDeposit(sc.nextInt());
        } 
        else{
            System.out.print("Value : ");
            Acc1.withdrawal(sc.nextInt());
        }
        Acc1.displayData();
        //====================Second Customer =====================
        
        System.out.print("\nEnter Second Balance : ");
        BALANCE2 = sc.nextInt();

        if (BALANCE2 < MinimumBALANCE) {

            System.out.println("\nYou Can't make a Checking Account Because Min Balance = 1000, So You can only make a Saving Account");
             Acc2 = new SavingAccount("Ali", "Giza", "01212856224");
             Acc2.makeAccount(BALANCE2,3005050);
        } else {

            System.out.println("\nOk , You'll make a Saving Account ");
             Acc2 = new CheckingAccount("Ali", "Giza", "01212856224");
             Acc2.makeAccount(BALANCE2,3005050);
        }
        
        //-----
        System.out.print("\nIf you want to make a Deposit Enter , 1 and Deposit value\nIf you want to make a Withdrawal Enter , 2 and Withdrawal value\nChoice :");
        if(sc.nextInt()==1){ 
            System.out.print("Value : ");
            Acc2.makeDeposit(sc.nextInt());
        } 
        else{
            System.out.print("Value : ");
            Acc2.withdrawal(sc.nextInt());
        }
        Acc2.displayData();
        //==============================================================
        
        
    }

}
