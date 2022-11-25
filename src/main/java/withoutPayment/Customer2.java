package withoutPayment;

import Full_Implementation.Cart;
import Full_Implementation.Payment;

public class Customer2 {
    public Payment2 payment2;
    private String customerId;
    private String customerName;
    public int cartId;
    public Cart2 cart;
    private String idName="Customer";
    private int customerCount=1;
    public Customer2(String name, int cartId){
        customerName=name;
        customerId= idName+customerCount;
        cart= new Cart2(cartId);
        payment2= new Payment2();
        customerCount++;
    }
}
