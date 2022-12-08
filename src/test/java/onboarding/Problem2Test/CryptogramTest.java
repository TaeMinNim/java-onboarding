package onboarding.Problem2Test;

import onboarding.Problem2Class.Cryptogram;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

public class CryptogramTest {
    @ParameterizedTest
    @MethodSource("removeDuplicationTestData")
    void removeDuplicationTest(String cryptoString, String result){
        Cryptogram cryptogram = new Cryptogram(cryptoString);
        String actual = cryptogram.removeDuplication();
        assertThat(actual).isEqualTo(result);
    }

    static Stream<Arguments> removeDuplicationTestData(){
        return Stream.of(
                Arguments.of("abbba", "aa"),
                Arguments.of("browoanoommnaon", "browoannaon"),
                Arguments.of("browoannaon", "browoaaon"),
                Arguments.of("browoaaon", "browoon"),
                Arguments.of("browoon", "brown"),
                Arguments.of("zyelleyz", "zyeeyz"),
                Arguments.of("zyeeyz", "zyyz"),
                Arguments.of("zz", "")
        );
    }

}
