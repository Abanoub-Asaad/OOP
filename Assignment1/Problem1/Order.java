
package problem1;

import java.util.Scanner;

/**
 *
 * @author Abanoub
 */
public class Order {
 
        Scanner sc = new Scanner(System.in) ;
    
        private int numOfItems  ;
        private  int totalPrice ;
        private String PaymentType ;
        private Product items [] = new Product[5] ;

        public Order(int numOfItems )
        {
            
           this.numOfItems = numOfItems ;
           
          
           for(int i=0 ; i<numOfItems ; i++)
            {
                items[i] = new Product();
                
                System.out.println("Add Details for Client "+(i+1) + " :");
                System.out.print("ItemName : ");
                
                addItem(sc.next() , i);
            }
           
            
        }
        
        public void addItem(String itemName , int i){
             
            
             items[i].setName(itemName) ;
             
             System.out.print("ItemPrice : ");
             items[i].setPrice(sc.nextInt());
             
             System.out.print("ItemQuantity : ");
             items[i].setQuantity(sc.nextInt());
             
             totalPrice+=(items[i].getPrice()*items[i].getQuantity()) ;
        }
        
        public void removeItem(String itemName){
            for(int i=0 ; i<items.length ; i++ )
            {
                if(items[i].getName()==itemName)
                {
                    // shifting elements
                    for(int j = i; j < items.length - 1; j++){
                        items[j] = items[j+1];
                    }
                    break;
                }
            }
        }

    public void setPaymentType(String PaymentType) {
        this.PaymentType = PaymentType;
    }

    public String getPaymentType() {
        return PaymentType;
    }

    
    
    public  int getTotalPrice() {
        return totalPrice;
    }
 
    public void displayData(){
        
        System.out.println("\n"+"----------------For "+getPaymentType()+"----------------" );
        for(int i=0 ; i<numOfItems ; i++){
            System.out.println("You ordered "+items[i].getName()+" and its price = "+items[i].getPrice()
                    +" , with quantity = "+items[i].getQuantity());
        }
        
    }
}
