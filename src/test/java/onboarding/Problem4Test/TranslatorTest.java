package onboarding.Problem4Test;

import onboarding.Problem4Class.Translator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.*;
public class TranslatorTest {
    Translator translator = new Translator();

    @ParameterizedTest
    @CsvSource(value = { "abcdefghijklmnopqrstuvwxyz:zyxwvutsrqponmlkjihgfedcba", "ABCDEFGHIJKLMNOPQRSTUVWXYZ:ZYXWVUTSRQPONMLKJIHGFEDCBA", "Hello world!:Svool dliow!" }, delimiter = ':')
    void toGreenFrogWordTest(String word, String result){
        String actual = translator.toGreenFrogWord(word);
        assertThat(actual).isEqualTo(result);
    }

}
