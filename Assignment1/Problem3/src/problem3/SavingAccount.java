
package problem3;

/**
 *
 * @author Abanoub
 */
public class SavingAccount extends Account{
    
    private float interestRate = 0.7f ; 

    SavingAccount(String name , String address , String phone){
        
        customer = new Customer (name , address, phone) ;
        
    }
    
    
    

    @Override
    public float displayCurrentBalance() {
        return  (balance+balance*interestRate) ;
    }
    
}
