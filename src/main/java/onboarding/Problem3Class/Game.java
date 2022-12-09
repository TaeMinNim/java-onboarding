package onboarding.Problem3Class;

public class Game {
    private int number;
    private int count = 1;
    private final Counter counter = new Counter();

    public Game(int number){
        this.number = number;
    }

    public int start(){
        int result = 0;
        while(lessThanNumber()){
            result += counter.matchCount(count);
            count++;
        }

        return result;
    }

    private boolean lessThanNumber(){
        return count <= number;
    }
}
