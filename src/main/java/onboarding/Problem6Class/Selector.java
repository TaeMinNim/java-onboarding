package onboarding.Problem6Class;

import java.util.ArrayList;
import java.util.List;

public class Selector {
    private final static int EMAIL = 0;
    private final static int NICKNAME = 1;
    private List<Boolean> duplication;
    private List<Crew> crews;

    public Selector(List<List<String>> forms){
        this.crews = new ArrayList<>();
        for(List<String> form: forms){
            crews.add(new Crew(form.get(EMAIL), form.get(NICKNAME)));
        }

        this.duplication = new ArrayList<>();
        for(int i = 0; i < crews.size(); i++){
            duplication.add(false);
        }
    }

    public List<String> getDuplicationEmail(){
        for(int i = 0; i < crews.size(); i++){
            findDuplicationCrew(i);
        }
        List<String> email = new ArrayList<>();
        for(int i = 0; i < crews.size(); i++){
            if(duplication.get(i)) {
                Crew crew = crews.get(i);
                email.add(crew.getEmail());
            }
        }
        System.out.println(duplication);
        return email;
    }

    private void findDuplicationCrew(int crewIndex){
        Crew crew = crews.get(crewIndex);
        for(int i = 0; i < crews.size(); i++){
            if(duplication.get(i) || i == crewIndex){
                continue;
            }
            if(crew.isDuplicationNickname(crews.get(i))){
                duplication.set(i, true);
                duplication.set(crewIndex, true);
            }
        }
    }


}
