package onboarding.Problem1Class;

import java.util.List;

public class Player {
    private final static int MAX_SIZE = 2;
    private final static int MIN_PAGE = 1;
    private final static int MAX_PAGE = 400;
    private final static int LEFT = 0;
    private final static int RIGHT = 1;
    private final List<Integer> page;

    public Player(List<Integer> page){
        validData(page);
        this.page = page;
    }

    private void validData(List<Integer> page){
        if(page.size() != MAX_SIZE){
            throw new IllegalArgumentException("page 리스트는 크기가 2이어야 합니다");
        }

        int left = page.get(LEFT);
        int right = page.get(RIGHT);
        if(!(isValidPage(left) && isValidPage(right))){
            throw new IllegalArgumentException("page는 1~400 사이의 값이어야 합니다");
        }
        if(right - left != 1){
            throw new IllegalArgumentException("page는 오른쪽 페이지가 왼쪽 페이지보다 1만큼 커야 합니다");
        }
    }

    private boolean isValidPage(int number){
       return number >= MIN_PAGE && number <= MAX_PAGE;
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
