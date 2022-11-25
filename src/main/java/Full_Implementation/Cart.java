package Full_Implementation;

import java.util.ArrayList;

public class Cart {
    private int cartId;
    private float total_cost;
    ArrayList<Product> productList = new ArrayList<Product>();

    public Cart(int cartId){
        this.cartId=cartId;
        this.total_cost=0.0F;
    }
    public void addProduct(Product product){
        productList.add(product);
    }
    public void removeProduct(int productId){
        productList.remove(productId);
    }

    public ArrayList<Product> getProductList() {
        System.out.println("Products on the cart :");
        for (Product product: productList){
            System.out.println("Name: "+product.getName()+" Price: "+product.getPrice()+" Group: "+product.getGroup());
        }
        return productList;
    }
    public void totalCostCount(){
        for (Product product:productList){
            total_cost+=product.getPrice();
        }
        System.out.println("Total Cost of items = "+total_cost);
    }
    public float getTotal_cost(){
        return total_cost;
    }
}
