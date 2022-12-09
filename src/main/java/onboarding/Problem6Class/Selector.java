package onboarding.Problem6Class;

import java.util.ArrayList;
import java.util.List;

public class Selector {
    private final static int EMAIL = 0;
    private final static int NICKNAME = 1;
    private List<List<String>> duplication;
    private List<List<String>> crews;

    public Selector(List<List<String>> forms){
        this.crews = new ArrayList<>(forms);
        this.duplication = new ArrayList<>();
    }
    
    private boolean isDuplication(String nickname, String other){
        List<String> partOfNicknames = divide(nickname);
        for(String partOfNickname: partOfNicknames){
            if(other.contains(partOfNickname)){
                return true;
            }
        }

        return false;
    }

    private List<String> divide(String nickname){
        List<String> partOfNicknames = new ArrayList<>();
        for(int i = 0; i < nickname.length() - 1; i++){
            String partOfNickname = nickname.substring(i, i + 1);
            partOfNicknames.add(partOfNickname);
        }

        return partOfNicknames;
    }
}
