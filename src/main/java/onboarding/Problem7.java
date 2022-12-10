package onboarding;

import onboarding.Problem7Class.Controller;

import java.util.Collections;
import java.util.List;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        Controller controller = new Controller();
        List<String> answer = controller.recommend(user, friends, visitors);
        return answer;
    }
}
