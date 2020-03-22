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
        Customer customer1 , customer2 ;

      //======================First Customer ======================
        System.out.print("Hi , Enter Balance For Client 1 : ");
        BALANCE1 = sc.nextInt();
        
        if (BALANCE1 < MinimumBALANCE)
        {
            System.out.println("\nYou Can't make a Checking Account Because Min Balance = 1000, So You can only make a Saving Account");
            customer1 = new Customer("Abanoub", "Cairo", "01212836883");
            customer1.setAccountData("SavingAccount" , BALANCE1 , 25050 );
            
        } 
        else
        {
            System.out.println("\nOk , You'll make a Checking Account ");
             customer1 = new Customer("Abanoub", "Cairo", "01212836883");
             customer1.setAccountData("CheckingAccount" , BALANCE1 , 25050 );
        }
        //====================Second Customer =====================
        
        System.out.print("------------------------------------------\nEnter Balance For Client 2 : ");
        BALANCE2 = sc.nextInt();

        if (BALANCE2 < MinimumBALANCE)
        {

            System.out.println("\nYou Can't make a Checking Account Because Min Balance = 1000, So You can only make a Saving Account");
             customer2 = new Customer("Ali", "Giza", "01212856224");
             customer2.setAccountData("SavingAccount" ,BALANCE2,3005050);
        } 
        else
        {

            System.out.println("\nOk , You'll make a Checking Account ");
             customer2 = new Customer("Ali", "Giza", "01212856224");
             customer2.setAccountData("CheckingAccount" ,BALANCE2,3005050);
        }
        //===========
        customer1.displayData();
        customer2.displayData();
    }

}
