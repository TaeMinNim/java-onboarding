package onboarding;

import onboarding.Problem4Class.Translator;

public class Problem4 {
    public static String solution(String word) {
        Translator translator = new Translator();
        String answer = translator.toGreenFrogWord(word);
        return answer;
    }
}
