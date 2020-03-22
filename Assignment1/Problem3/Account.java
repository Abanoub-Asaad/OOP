
package problem3;

import java.util.Date;

/**
 *
 * @author Abanoub Asaad
 */
public abstract class Account {
    
    protected int accountNumber ;
    protected float balance  ;
    protected Date dateOpened = new Date(2000, 7, 12);
    
    
    Customer customer ;
    
    public abstract float displayCurrentBalance();
    
    public void makeAccount(float balance , int accountNumber){
        this.balance = balance ;
        this.accountNumber = accountNumber ;
    }
    
    public void makeDeposit(float salary){
        balance+=salary ;
    }
    
    public void withdrawal(float salary){
        balance-=salary ;
    }

    
    public void checkRequest(){
        System.out.print("\nIf you want to make a Deposit Enter 1 and Deposit value\nIf you want to make a Withdrawal Enter 2 and Withdrawal value\nChoice : ");
      
        if(Problem3.sc.nextInt()==1){ 
            System.out.print("Value : ");
            makeDeposit(Problem3.sc.nextInt());
        } 
        else if(Problem3.sc.nextInt()==2){
            System.out.print("Value : ");
            withdrawal(Problem3.sc.nextInt());
        }
        else{
            System.out.print("Your request is invalid ");
        }
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    
    
}
 