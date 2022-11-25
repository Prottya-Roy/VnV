package withoutPayment;

import Full_Implementation.Product;

import java.util.ArrayList;

public class Cart2 {
    private int cartId;
    private float total_cost;
    ArrayList<Product2> productList = new ArrayList<Product2>();

    public Cart2(int cartId){
        this.cartId=cartId;
        this.total_cost=0.0F;
    }
    public void addProduct(Product2 product){
        productList.add(product);
    }
    public void removeProduct(int productId){
        productList.remove(productId);
    }

    public ArrayList<Product2> getProductList() {
        System.out.println("Products on the cart :");
        for (Product2 product: productList){
            System.out.println("Name: "+product.getName()+" Price: "+product.getPrice()+" Group: "+product.getGroup());
        }
        return productList;
    }
    public void totalCostCount(){
        for (Product2 product:productList){
            total_cost+=product.getPrice();
        }
        System.out.println("Total Cost of items = "+total_cost);
    }
    public float getTotal_cost(){
        return total_cost;
    }
}
