package Full_Implementation;

import java.util.ArrayList;

public class Admin {
    private int adminId;
    private int adminCount =0;
    private String adminName;
    public ArrayList<Product> shopProductList = new ArrayList<Product>();
    public Admin(String name){
        adminName=name;
        adminId= adminCount++;
    }

    public ArrayList<Product> getShopProductList() {
        System.out.println("Products on the shop :");
        for (Product product: shopProductList){
            System.out.println("Name: "+product.getName()+" Price: "+product.getPrice()+" Group: "+product.getGroup());
        }
        return shopProductList;
    }

    public void addProducts(String name, float price, String group){
        Product product= new Product(name,price,group);
        shopProductList.add(product);
    }
    public void deleteProduct(int productId){
        shopProductList.remove(productId);
    }
    public void modifyProduct(int productId, String name, float price, String group){
        Product product= shopProductList.get(productId);
        product.setProductName(name);
        product.setPrice(price);
        product.setGroup(group);
    }
    public ArrayList<Product> setShipment(){
        System.out.println("Products in the shipment :");
        for (Product product: shopProductList){
            System.out.println("Name: "+product.getName()+" Price: "+product.getPrice()+" Group: "+product.getGroup());
        }
        return shopProductList;
    }
}
