package withoutPayment;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class Main2Test {
    static Admin2 admin= new Admin2("Prottoy");
    static Cart2 cart = new Cart2(1);
    static Customer2 customer= new Customer2("Abid",1);
    static Payment2 payment2;
    @BeforeAll
    static void init(){
        payment2= Mockito.mock((Payment2.class));

        admin.addProducts("Murgi",300F,"Bird");
        admin.addProducts("Begun",50F,"Vegetable");
        admin.addProducts("Alu",25F,"vegetable");
        admin.addProducts("Peyaj",35F,"vegetable");


        admin.getShopProductList();
        admin.modifyProduct(1,"Fulkopi",100F,"Vegetable");
        admin.getShopProductList();
        admin.deleteProduct(2);


        cart.addProduct(new Product2("Murgi",300F,"Bird"));
        cart.addProduct(new Product2("Fulkopi",100F,"Vegetable"));
        cart.getProductList();
        cart.removeProduct(1);
        cart.getProductList();
        cart.totalCostCount();
    }

    @Test
    void main() {
        Mockito.doReturn(300F).when(payment2).makePayment(ArgumentMatchers.any(Float.class));
        assertEquals("300F", customer.payment2.makePayment(cart.getTotal_cost()));
    }
}