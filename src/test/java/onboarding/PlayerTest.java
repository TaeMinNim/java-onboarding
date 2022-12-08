package onboarding;

import onboarding.Problem1Class.Player;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.*;
import java.util.List;
import java.util.stream.Stream;

public class PlayerTest {
    @ParameterizedTest(name = "page = {0} / result = {1}")
    @MethodSource("generateData")
    void getScoreTest(List<Integer> page, int result){
        Player player = new Player(page);
        int score = player.getScore();
        assertThat(score).isEqualTo(result);
    }
    static Stream<Arguments> generateData(){
        return Stream.of(
                Arguments.of(List.of(89, 90), 72), //왼쪽 곱하기
                Arguments.of(List.of(197, 198), 72), //오른쪽 곱하기
                Arguments.of(List.of(109, 110), 10), //왼쪽 더하기
                Arguments.of(List.of(110, 111), 3) //오른쪽 더하기
        );
    }
}
