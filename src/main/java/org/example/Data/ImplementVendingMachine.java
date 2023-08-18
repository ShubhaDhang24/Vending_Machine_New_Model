package org.example.Data;

import org.example.NewModel.Money;
import org.example.NewModel.Product;

public class ImplementVendingMachine implements MachineVending{
    @Override
    public void addCurrency(Money amt) {
        

    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public Product requestId(int id) {
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int id) {
        return null;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}
