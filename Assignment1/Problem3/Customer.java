
package problem3;

/**
 *
 * @author Abanoub
 */
public class Customer {
    
    private String name ;
    private String address ;
    private String phone ;
    public Account account ;

    public Customer(String name , String address , String phone) {
        this.name = name ;
        this.address = address ;
        this.phone = phone ;
   
    }

    public void setAccountData(String accountType , int balance , int accountNumber){
        
        if(accountType == "SavingAccount"){
            account = new SavingAccount(balance , accountNumber);
            
        }
        else {
            account = new CheckingAccount(balance , accountNumber);
        }
    }
    
     public void displayData(){
        System.out.println("----------Details--------\nClient Name : "+getName());
        System.out.println("Client Address : "+getAddress());
        System.out.println("Client Phone: "+getPhone());
        System.out.println("Account Number : "+account.accountNumber);
        System.out.println("Date Opened : "+account.dateOpened); 
        System.out.println("Current Balance : "+account.displayCurrentBalance());
        System.out.println("--------------------------");
       // System.out.println("\n--------------------------------------------");
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public Account getAccount() {
        return account;
    }
    
    
    
}
