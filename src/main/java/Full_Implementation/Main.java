package Full_Implementation;

public class Main {
    public static void main(String[] args) {
        Admin admin= new Admin("Prottoy");
        admin.addProducts("Murgi",300F,"Bird");
        admin.addProducts("Begun",50F,"Vegetable");
        admin.addProducts("Alu",25F,"vegetable");
        admin.addProducts("Peyaj",35F,"vegetable");


        admin.getShopProductList();
        admin.modifyProduct(1,"Fulkopi",100F,"Vegetable");
        admin.getShopProductList();
        admin.deleteProduct(2);

        Cart cart = new Cart(1);
        Customer customer= new Customer("Abid",1);
        cart.addProduct(new Product("Murgi",300F,"Bird"));
        cart.addProduct(new Product("Fulkopi",100F,"Vegetable"));
        cart.getProductList();
        cart.removeProduct(1);
        cart.getProductList();
        cart.totalCostCount();

        customer.payment.makePayment(cart.getTotal_cost());
    }
}
