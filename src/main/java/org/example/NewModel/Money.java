package org.example.NewModel;

public enum Money {
    ONE(1), TWO(2), FIVE(5), TEN(10), TWENTY(20),FIFTY(50),HUNDRED(100), TWO_HUND(200),THOUSAND(1000);
    private int val;

    //CONSTRUCTOR
    Money(int val) {
        this.val = val;
    }

    //GETTERS AND SETTERS
    public int getVal() {
        return val;
    }


}
