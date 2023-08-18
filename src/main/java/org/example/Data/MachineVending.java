package org.example.Data;

import org.example.NewModel.Money;
import org.example.NewModel.Product;

public interface MachineVending {
    void addCurrency(Money amt);
    int getBalance();
    Product requestId(int id);
    int endSession();
    String getDescription(int id);
    String[] getProducts();
}
