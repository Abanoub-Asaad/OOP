
package problem3;

/**
 *
 * @author Abanoub
 */
public class CheckingAccount extends Account{
    
    private float minimumBalance ;
    
    
    CheckingAccount(int balance , int accountNmber){
        
        this.balance = balance ;
        this.accountNumber = accountNmber ;
        checkRequest();
    }
    

    @Override
    public float displayCurrentBalance() {
        return balance ;
    }
    
}
