package onboarding.Problem6Class;

import java.util.ArrayList;
import java.util.List;

public class Nickname {
    private final String nickname;

    public Nickname(String nickname){
        this.nickname = nickname;
    }
    public boolean isDuplication(Nickname other){
        List<String> partOfNicknames = divide(nickname);
        for(String partOfNickname: partOfNicknames){
            if(other.nickname.contains(partOfNickname)){
                return true;
            }
        }

        return false;
    }

    private List<String> divide(String nickname){
        List<String> partOfNicknames = new ArrayList<>();
        for(int i = 0; i < nickname.length() - 1; i++){
            String partOfNickname = nickname.substring(i, i + 2);
            partOfNicknames.add(partOfNickname);
        }

        return partOfNicknames;
    }
}
