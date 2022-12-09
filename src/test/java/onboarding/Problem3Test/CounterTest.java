package onboarding.Problem3Test;

import onboarding.Problem3Class.Counter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.*;
public class CounterTest {
    Counter counter = new Counter();

    @ParameterizedTest
    @CsvSource(value = { "1:0", "34:1", "164:1", "93:2", "619:2", "333:3", "1369:3" }, delimiter = ':')
    void matchCountTest(int number, int result){
        int match = counter.matchCount(number);
        assertThat(match).isEqualTo(result);
    }
}
