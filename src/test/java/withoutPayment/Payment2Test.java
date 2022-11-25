package withoutPayment;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class Payment2Test {
    Payment2 payment2;

    @BeforeAll
    void init(){
    }
    @Test
    void makePayment() {
        Mockito.doReturn(300F).when(payment2).makePayment(ArgumentMatchers.any(Float.class));
    }
}