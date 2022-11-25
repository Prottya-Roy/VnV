package Full_Implementation;

public class Customer {
    private String customerId;
    private String customerName;
    public int cartId;
    public Cart cart;
    public Payment payment;
    private String idName="Customer";
    private int customerCount=1;
    public Customer(String name, int cartId){
        customerName=name;
        customerId= idName+customerCount;
        cart= new Cart(cartId);
        payment= new Payment();
        customerCount++;
    }

}
