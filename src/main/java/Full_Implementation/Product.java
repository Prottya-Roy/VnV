package Full_Implementation;

public class Product {
    private int productId;
    private  String productName;
    private float price;
    private String group;
    private int productnumber=0;

    public Product(String name, float price, String group){
        productId = productnumber++;
        productName = name;
        this.price=price;
        this.group= group;
    }
    public void setProductName(String name){
        productName=name;
    }
    public void setPrice(float price){
        this.price=price;
    }
    public void setGroup(String group){
        this.group=group;
    }
    public String getName(){
        return productName;
    }
    public float getPrice(){
        return price;
    }
    public String getGroup(){
        return group;
    }
}
