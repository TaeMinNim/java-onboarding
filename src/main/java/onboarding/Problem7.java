package onboarding;

import onboarding.Problem7Class.Recommend;

import java.util.Collections;
import java.util.List;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        Recommend recommend = new Recommend(user, friends, visitors);
        List<String> answer = recommend.start();
        return answer;
    }
}
