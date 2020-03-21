
package problem2;

/**
 *
 * @author Abanoub
 */
public class Invoice {
   
    private int ID ;
    private Customer customer ;
    private float Discount = 0.05f ;
    private float Value ;
    
    public Invoice(int ID , Customer customer , float value){
        
        this(ID , value);
        this.customer = customer;
    }
    
    public Invoice(int ID , float value ){
        this.ID = ID ;
        this.Value = value ;
    }
    
    public float ApplyDiscount(){
  
        Value -= getDiscount()*Value ;
        return Value ;
    }
    
    public void Display_Invoice(){
        
        System.out.println("==================================================");
        System.out.println("Invoice ID : "+ID);
        System.out.println("Customer ID : "+customer.ID);
        System.out.println("Customer Name : "+customer.Name);
        System.out.println("Voucher : "+customer.getVoucher());
        System.out.println("Discount : "+Discount);
        System.out.println("Value After Discount: "+Value);
        
    }

    public float getDiscount(){
      
         Discount += ( ((int)(Value/1000)) *.1 );
        
        
        if(customer.getVoucher()>0)
            Discount+=(customer.getVoucher()) ;
        
        return Discount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

  
    public Customer getCustomer() {
        return customer;
    }

    
    
}
