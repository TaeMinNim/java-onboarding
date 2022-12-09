package onboarding.Problem3Class;

public class Controller {
    public int gameStart(int number){
        Game game = new Game(number);
        return game.start();
    }
}
