package Full_Implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {
    static Cart cart;
    static Cart cart2;

    static Product product;
    static Product product2;
    static Product product3;


    @BeforeAll
    static void setUp() {
        cart = new Cart(1);
        cart2 = new Cart(2);

        product = new Product("Apple", 150F,"Fruit");
        product2 = new Product("Milk",90F, "Drink");
        product3= new Product("Moong",140F,"dal");

        cart.addProduct(product);
        cart.addProduct(product2);
        cart.addProduct(product3);

    }

    @Test
    void addProduct() {
        cart.addProduct(product);
        Assertions.assertEquals(3, cart.getProductList().size());
    }

    @Test
    void removeProduct() {
        cart.removeProduct(1);
        Assertions.assertEquals(2, cart.getProductList().size());
        Assertions.assertEquals("Moong", cart.getProductList().get(1).getName());
    }


    @Test
    void viewTotalPrice() {
        cart.totalCostCount();
        Assertions.assertEquals(440F, cart.getTotal_cost());
    }
}