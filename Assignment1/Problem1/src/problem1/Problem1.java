
package problem1;

/**
 *
 * @author Abanoub
 */
public class Problem1 {
    
    public static void main(String[] args) {
      
        System.out.println("First : OnlineOrder  \n---------------------- ");
        OnlineOrder online_order_obj = new OnlineOrder(3  ); 
        online_order_obj.displayData();
        
        System.out.println("\nSecond : NormalOrder  \n----------------------  ");
        NormalOrder normal_order_obj = new NormalOrder(1 );
        normal_order_obj.displayData();
        
        System.out.println("Total Price of The Online Order = "+online_order_obj.getTotalPrice());
        System.out.println("Total Price of The Normal Order = "+normal_order_obj.getTotalPrice());
        System.out.println("Total Price of The Normal Order After Discount  = "+normal_order_obj.calculateDiscount(normal_order_obj.getTotalPrice()));
    }
     
    
}
