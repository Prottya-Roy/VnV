package withoutPayment;

public class Main2 {
    public static void main(String[] args) {
        Admin2 admin= new Admin2("Prottoy");
        admin.addProducts("Murgi",300F,"Bird");
        admin.addProducts("Begun",50F,"Vegetable");
        admin.addProducts("Alu",25F,"vegetable");
        admin.addProducts("Peyaj",35F,"vegetable");


        admin.getShopProductList();
        admin.modifyProduct(1,"Fulkopi",100F,"Vegetable");
        admin.getShopProductList();
        admin.deleteProduct(2);

        Cart2 cart = new Cart2(1);
        Customer2 customer= new Customer2("Abid",1);
        cart.addProduct(new Product2("Murgi",300F,"Bird"));
        cart.addProduct(new Product2("Fulkopi",100F,"Vegetable"));
        cart.getProductList();
        cart.removeProduct(1);
        cart.getProductList();
        cart.totalCostCount();

        customer.payment2.makePayment(cart.getTotal_cost());
    }
}
