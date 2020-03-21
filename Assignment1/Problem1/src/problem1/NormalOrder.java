
package problem1;

/**
 *
 * @author Abanoub
 */
public class NormalOrder extends Order{
    
    
        private int discountAmount ;

        public NormalOrder(int numOfItems) {
            super(numOfItems);
            setPaymentType("NormalOrder");
        }
        
        public int calculateDiscount(int totalPrice){
            
            return (totalPrice-(totalPrice*20/100) ) ;
        }
        
    
}
