package onboarding.Problem5Class;

import java.util.ArrayList;
import java.util.List;

public class ATM {
    private int money;
    private final static List<Integer> UNITS = List.of(50000, 10000, 5000, 1000, 500, 100, 50, 10, 1);
    public ATM(int money){
        this.money = money;
    }

    public List<Integer> publication(){
        List<Integer> cash = new ArrayList<>();
        for(int unit: UNITS){
            cash.add(count(unit));
        }

        return cash;
    }
    private int count(int unit){
        int cash = money / unit;
        money %= unit;
        return cash;
    }
}
