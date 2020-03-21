
package problem2;

/**
 *
 * @author Abanoub
 */
public class Customer extends Person{
    
    private float Voucher;
    public static int count ;
    
    public Customer(String name , int id , float voucher){
        
        Name = name ;
        Voucher = voucher ;
        ID = id ;
        count++ ;
    }

    Customer() {
    }

    public float getVoucher() {
        return Voucher;
    }
    
    
}
