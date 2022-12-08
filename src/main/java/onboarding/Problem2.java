package onboarding;

import onboarding.Problem2Class.Controller;

public class Problem2 {
    public static String solution(String cryptogram) {
        Controller controller = new Controller();
        String answer = controller.startAnalyze(cryptogram);
        return answer;
    }
}
