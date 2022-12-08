package onboarding;

import onboarding.Problem1Class.GameController;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        GameController gameController = new GameController();
        int answer = gameController.gameStart(pobi, crong);
        return answer;
    }
}