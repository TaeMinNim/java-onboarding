package onboarding.Problem1Test;

import onboarding.Problem1Class.Judge;
import onboarding.Problem1Class.Player;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.*;
import java.util.List;
import java.util.stream.Stream;

public class JudgeTest {
    @ParameterizedTest(name = "pobi = {0} / crong = {1} / result = {2}")
    @MethodSource("generateData")
    void compareTest(List<Integer> pobi, List<Integer> crong, int result){
        Player pobiPlyaer = new Player(pobi);
        Player crongPlayer = new Player(crong);
        int actual = Judge.compare(pobiPlyaer, crongPlayer);
        assertThat(actual).isEqualTo(result);
    }

    static Stream<Arguments> generateData(){
        return Stream.of(
                Arguments.of(List.of(97, 98), List.of(197, 198), 0),
                Arguments.of(List.of(131, 132), List.of(211, 212), 1),
                Arguments.of(List.of(211, 212), List.of(131, 132), 2)
        );
    }
}
