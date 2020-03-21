
package problem2;

/**
 *
 * @author Abanoub
 */
public class Customer extends Person{
    
    private float Voucher;
    public static int count ;
    
    public Customer(String name , int id , float voucher){
        
        super(id) ;
        Name = name ;
        Voucher = voucher ;
        
        count++ ;
    }


    public float getVoucher() {
        return Voucher;
    }
    
    
}
