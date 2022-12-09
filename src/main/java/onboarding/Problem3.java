package onboarding;

import onboarding.Problem3Class.Controller;

public class Problem3 {
    public static int solution(int number) {
        Controller controller = new Controller();
        int answer = controller.gameStart(number);
        return answer;
    }
}
