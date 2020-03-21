
package problem2;

/**
 *
 * @author Abanoub
 */
public class Problem2 {

    
    public static void main(String[] args) {
       
        Customer customer1 = new Customer("Ahmed", 101, 0.0f);
        Customer customer2 = new Customer("Ayman", 102, 0.02f);
        
        System.out.println("The Count of the created Customers = "+Customer.count);
        
        Invoice invoice_obj1 = new Invoice(001, customer1 , 3500);
        Invoice invoice_obj2 = new Invoice(002, customer2 , 1000);
        
        invoice_obj1.ApplyDiscount();
        invoice_obj1.Display_Invoice();
        
        invoice_obj2.ApplyDiscount();
        invoice_obj2.Display_Invoice();
        
    }
    
}
