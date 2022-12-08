package onboarding.Problem2Class;

public class Controller {
    public String startAnalyze(String cryptoString){
        Cryptogram cryptogram;
        do{
            cryptogram = new Cryptogram(cryptoString);
            cryptoString = cryptogram.removeDuplication();
        } while(!cryptogram.isAnalyzeComplete());

        return cryptoString;
    }
}
