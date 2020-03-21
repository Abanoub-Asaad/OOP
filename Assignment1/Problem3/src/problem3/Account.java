
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
    
    public void displayData(){
        System.out.println("----------Details--------\nClient Name : "+customer.getName());
        System.out.println("Client Address : "+customer.getAddress());
        System.out.println("Client Phone: "+customer.getPhone());
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Date Opened : "+dateOpened); 
        System.out.println("Current Balance : "+displayCurrentBalance());
        System.out.println("--------------------------");
       // System.out.println("\n--------------------------------------------");
    }
    
    public void makeDeposit(float salary){
        balance+=salary ;
    }
    
    public void withdrawal(float salary){
        balance-=salary ;
    }
    
    

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    
    
}
 