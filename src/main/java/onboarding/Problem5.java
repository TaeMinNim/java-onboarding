package onboarding;

import onboarding.Problem5Class.ATM;

import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        ATM atm = new ATM(money);
        List<Integer> answer = atm.publication();
        return answer;
    }
}
