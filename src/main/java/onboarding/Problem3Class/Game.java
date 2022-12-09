package onboarding.Problem3Class;

public class Game {
    private int number;
    private int count = 0;

    public Game(int number){
        this.number = number;
    }

    private boolean lessThanNumber(){
        return count <= number;
    }
}
