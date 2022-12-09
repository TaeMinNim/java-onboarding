package onboarding.Problem3Class;

public class Counter {
    public int matchCount(int number){
        int match = 0;
        for(; number > 0; number /= 10){
            int digit = number % 10;
            if(digit == 3 || digit == 6 || digit == 9){
                match++;
            }
        }

        return match;
    }
}
