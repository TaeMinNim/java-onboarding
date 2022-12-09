package onboarding.Problem5Class;

import java.util.List;

public class ATM {
    private int money;
    private final List<Integer> units = List.of(50000, 10000, 5000, 1000, 500, 100, 50, 10, 1);
    public ATM(int money){
        this.money = money;
    }

    private int count(int unit){
        return money / unit;
    }
}
