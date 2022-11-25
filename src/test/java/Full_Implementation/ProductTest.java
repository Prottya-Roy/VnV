package Full_Implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    static Product product;
    static Product product2;
    static Product product3;

    @BeforeAll
    static void setUp() {
        product = new Product("Apple", 150F,"Fruit");
        product2 = new Product("Milk",90F, "Drink");
        product3= new Product("Moong",140F,"dal");
    }

    @Test
    void setProductName() {
        product.setProductName("Red Apple");
        Assertions.assertEquals("Red Apple", product.getName());
    }
    @Test
    void setPrice(){
        product3.setPrice(50F);
        Assertions.assertEquals(50F,product3.getPrice());
    }

    @Test
    void setGroup() {
        product.setGroup("Red");
        Assertions.assertEquals("Red", product.getGroup());
    }

    @Test
    void getName() {
        Assertions.assertEquals("Milk", product3.getName());
    }

    @Test
    void getGroup() {
        Assertions.assertEquals("Fruit", product2.getGroup());
    }

    @Test
    void getPrice() {
        Assertions.assertEquals(10, product.getPrice());
    }
}