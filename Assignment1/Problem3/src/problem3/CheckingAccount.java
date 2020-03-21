
package problem3;

/**
 *
 * @author Abanoub
 */
public class CheckingAccount extends Account{
    
    private float minimumBalance ;
    
    
    CheckingAccount(String name , String address , String phone){
        
        customer = new Customer (name , address, phone) ;
       
    }

    

    @Override
    public float displayCurrentBalance() {
        return balance ;
    }
    
}
