package se.kth.iv1350.felixselling.mypos.integration;

public class CashRegister {
    private double cash;

    /**
     * Constructor for CashRegister
     */
    public CashRegister() {
        cash = 0;
    }

    /**
     * Method that adds cash to the register.
     * 
     * @param cash The amount of cash to add.
     */
    public void addCash(double cash) {
        this.cash += cash;
    }

    /**
     * Method that removes cash from the register.
     * 
     * @param cash The amount of cash to remove.
     */
    public void removeCash(double cash) {
        this.cash -= cash;
    }

}
