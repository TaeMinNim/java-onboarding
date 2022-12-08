package onboarding.Problem2Class;

public class Cryptogram {
    private String cryptogram;

    public Cryptogram(String cryptogram){
        this.cryptogram = cryptogram;
    }

    public String removeDuplication(){
        for(int index = 0; index < cryptogram.length() - 1; index++){
            if(duplicateNextIndex(index)){
                cryptogram = removeNext(index);
            }
        }

        return cryptogram;
    }

    private boolean duplicateNextIndex(int index){
        char current = cryptogram.charAt(index);
        char next = cryptogram.charAt(index + 1);

        return current == next;
    }

    private String removeNext(int index){
        StringBuffer cryptogramBuffer = new StringBuffer(cryptogram);
        cryptogramBuffer.deleteCharAt(index + 1);

        return cryptogramBuffer.toString();
    }
}
