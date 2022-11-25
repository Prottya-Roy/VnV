package withoutPayment;

import Full_Implementation.Product;

import java.util.ArrayList;

public class Admin2 {
    private int adminId;
    private int adminCount =0;
    private String adminName;
    public ArrayList<Product2> shopProductList = new ArrayList<Product2>();
    public Admin2(String name){
        adminName=name;
        adminId= adminCount++;
    }

    public ArrayList<Product2> getShopProductList() {
        System.out.println("Products on the shop :");
        for (Product2 product: shopProductList){
            System.out.println("Name: "+product.getName()+" Price: "+product.getPrice()+" Group: "+product.getGroup());
        }
        return shopProductList;
    }

    public void addProducts(String name, float price, String group){
        Product2 product= new Product2(name,price,group);
        shopProductList.add(product);
    }
    public void deleteProduct(int productId){
        shopProductList.remove(productId);
    }
    public void modifyProduct(int productId, String name, float price, String group){
        Product2 product= shopProductList.get(productId);
        product.setProductName(name);
        product.setPrice(price);
        product.setGroup(group);
    }
    public ArrayList<Product2> setShipment(){
        System.out.println("Products in the shipment :");
        for (Product2 product: shopProductList){
            System.out.println("Name: "+product.getName()+" Price: "+product.getPrice()+" Group: "+product.getGroup());
        }
        return shopProductList;
    }
}
