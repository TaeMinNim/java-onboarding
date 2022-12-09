package onboarding.Problem6Class;

import java.util.ArrayList;
import java.util.List;

public class Selector {
    private final static int EMAIL = 0;
    private final static int NICKNAME = 1;
    private List<Boolean> duplication;
    private List<List<String>> crews;

    public Selector(List<List<String>> forms){
        this.crews = new ArrayList<>(forms);
        this.duplication = new ArrayList<>();
        for(int i = 0; i < crews.size(); i++){
            duplication.add(false);
        }
    }

    public List<String> getDuplicationEmail(){
        for(List<String> crew: crews){
            String nickname = crew.get(NICKNAME);
            checkDuplication(nickname);
        }
        List<String> email = new ArrayList<>();
        for(List<String> crew: crews){
            email.add(crew.get(EMAIL));
        }

        return email;
    }

    private void checkDuplication(String nickname){
        for(int i = 0; i < crews.size(); i++){
            if(duplication.get(i)){
                continue;
            }
            if(isDuplication(nickname, crews.get(i).get(NICKNAME))){
                duplication.set(i, true);
            }
        }
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
