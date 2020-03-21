
package problem3;

/**
 *
 * @author Abanoub
 */
public class Customer {
    
    private String name ;
    private String address ;
    private String phone ;
    Account account ;

    public Customer(String name , String address , String phone) {
        this.name = name ;
        this.address = address ;
        this.phone = phone ;
    }

 

    public void setAccount(Account account) {
        this.account = account;
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
