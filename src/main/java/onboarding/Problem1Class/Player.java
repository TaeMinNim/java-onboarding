package onboarding.Problem1Class;

import java.util.List;

public class Player {
    private final static int LEFT = 1;
    private final static int RIGHT = 2;
    private final List<Integer> page;

    public Player(List<Integer> page){
        this.page = page;
    }

    public int getScore(){
        int leftScore = toScore(page.get(LEFT));
        int rightScore = toScore(page.get(RIGHT));

        if(leftScore > rightScore){
            return leftScore;
        }
        return rightScore;
    }

    private int toScore(int number){
        int addScore = 0;
        int mulScore = 1;

        for(;number > 0; number /= 10){
            int digit = number % 10;
            addScore += digit;
            mulScore *= digit;
        }

        if(addScore > mulScore){
            return addScore;
        }
        return mulScore;
    }
}
