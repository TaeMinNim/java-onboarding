package onboarding.Problem1Class;

public class Judge {
    private final static int P1WIN = 1;
    private final static int P2WIN = 2;
    private final static int DRAW = 0;

    public static int compare(Player player1, Player player2){
        int player1_score = player1.getScore();
        int player2_score = player2.getScore();

        if(player1_score > player2_score){
            return P1WIN;
        } else if(player1_score < player2_score){
            return P2WIN;
        }
        return DRAW;
    }
}
