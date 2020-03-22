
package problem3;

/**
 *
 * @author Abanoub
 */
public class SavingAccount extends Account{
    
    private float interestRate = 0.7f ; 

    SavingAccount(int balance , int accountNmber){
        
        this.balance = balance ;
        this.accountNumber = accountNmber ;
        checkRequest();
    }
    
    
    
    

    @Override
    public float displayCurrentBalance() {
        return  (balance+balance*interestRate) ;
    }
    
}
