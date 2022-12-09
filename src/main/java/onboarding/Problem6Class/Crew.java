package onboarding.Problem6Class;

public class Crew {
    private final String email;
    private final Nickname nickname;

    public Crew(String email, String nickname){
        this.email = email;
        this.nickname = new Nickname(nickname);
    }
    public boolean isDuplicationNickname(Crew other){
        return nickname.isDuplication(other.nickname);
    }

    public String getEmail(){
        return email;
    }
}
