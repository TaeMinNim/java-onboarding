package onboarding.Problem1Class;

import java.util.List;

public class GameController {
    public int gameStart(List<Integer> pobi, List<Integer> crong){
        Player pobiPlayer;
        Player crongPlyaer;
        try{
            pobiPlayer = new Player(pobi);
            crongPlyaer = new Player(crong);
        } catch(IllegalArgumentException e){
            return -1;
        }
        return Judge.compare(pobiPlayer, crongPlyaer);
    }
}
