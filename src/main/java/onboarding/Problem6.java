package onboarding;

import onboarding.Problem6Class.Selector;

import java.util.List;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        Selector selector = new Selector(forms);
        List<String> answer = selector.getDuplicationEmail();
        return answer;
    }
}
