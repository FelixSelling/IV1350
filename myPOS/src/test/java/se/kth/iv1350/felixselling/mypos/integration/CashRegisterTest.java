package se.kth.iv1350.felixselling.mypos.integration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashRegisterTest {

    @Test
    public void testAddCash() {
        double cash = 5000;
        CashRegister instance = new CashRegister();
        instance.addCash(cash);
    }

    @Test
    public void testRemoveCash() {
        double cash = 5000;
        CashRegister instance = new CashRegister();
        instance.removeCash(cash);
    }
    
}
