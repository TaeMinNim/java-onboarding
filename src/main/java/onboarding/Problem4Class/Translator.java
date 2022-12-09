package onboarding.Problem4Class;

public class Translator {
    private final static int MIN_LOWER_CASE = 97;
    private final static int MAX_LOWER_CASE = 122;
    private final static int MIN_UPPER_CASE = 65;
    private final static int MAX_UPPER_CASE = 90;

    private char toGreenFrogChar(char c){
        int ascii = (int)c;
        if(ascii >= MIN_LOWER_CASE && ascii <= MAX_LOWER_CASE){
            return (char)(MIN_LOWER_CASE + MAX_LOWER_CASE - ascii);
        } else if(ascii >= MIN_UPPER_CASE && ascii <= MAX_UPPER_CASE){
            return (char)(MIN_UPPER_CASE +  MAX_UPPER_CASE - ascii);
        }

        return c;
    }
}
