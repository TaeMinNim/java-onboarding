package onboarding.Problem6Test;

import onboarding.Problem6Class.Nickname;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.*;

public class NicknameTest {
    @ParameterizedTest
    @CsvSource(value = {
            "가나다라마바사:가나:true",
            "가나다라마바사:나다라:true",
            "가:가:true",
            "가나다라:가나다:true",
            "가나다라:나다라:true",
            "가나다:가:false",
            "가나다:가다:false"
    }, delimiter = ':')
    void isDuplicationTest(String myNickname, String otherNickname, boolean result){
        Nickname nickname = new Nickname(myNickname);
        Nickname other = new Nickname(otherNickname);
        boolean actual = nickname.isDuplication(other);
        assertThat(actual).isEqualTo(result);
    }
}
