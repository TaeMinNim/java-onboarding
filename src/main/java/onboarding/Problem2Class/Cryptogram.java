package onboarding.Problem2Class;

public class Cryptogram {
    private String cryptogram;

    public Cryptogram(String cryptogram){
        this.cryptogram = cryptogram;
    }

    public String removeDuplication(){
        int length = cryptogram.length() - 1;

        for(int index = 0; index < length; index++){
            if(duplicateNextIndex(index, cryptogram)) {
                cryptogram = removeDuplicationCurrentIndex(index);
                length = cryptogram.length() - 1;
                System.out.println(length);
                index -= 1;
            }
        }
        return cryptogram;
    }

    private String removeDuplicationCurrentIndex(int index){
        StringBuffer cryptogramBuffer = new StringBuffer(cryptogram);
        while(conditionCheck(index, cryptogramBuffer.toString())){
            cryptogramBuffer.deleteCharAt(index + 1);
        }
        cryptogramBuffer.deleteCharAt(index);

        return cryptogramBuffer.toString();
    }

    private boolean conditionCheck(int index, String cryptogram){
        return cryptogram.length() >= 2 && duplicateNextIndex(index, cryptogram);
    }

    private boolean duplicateNextIndex(int index, String cryptogram){
        char current = cryptogram.charAt(index);
        char next = cryptogram.charAt(index + 1);
        return current == next;
    }
}
