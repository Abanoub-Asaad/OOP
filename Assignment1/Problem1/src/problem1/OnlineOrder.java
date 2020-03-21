
package problem1;

/**
 *
 * @author Abanoub
 */
public class OnlineOrder extends Order{
    
private String deliveryDate ;
private final int shipmentFee = 0 ;

    public OnlineOrder(int numOfItems) {
        super(numOfItems);
        setPaymentType("OnlineOrder");
    }

    
    
}
