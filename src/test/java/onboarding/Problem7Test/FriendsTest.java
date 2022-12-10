package onboarding.Problem7Test;

import onboarding.Problem7Class.Friends;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.*;
import java.util.List;
import java.util.stream.Stream;

public class FriendsTest {
    @ParameterizedTest
    @MethodSource("generateData")
    void findUserFriendsTest(String user, List<List<String>> friendsList, List<String> result){
        Friends friends = new Friends(friendsList);
        List<String> actual = friends.findUserFriends(user);
        assertThat(actual).isEqualTo(result);
    }

    static Stream<Arguments> generateData(){
        return Stream.of(
                Arguments.of(
                        "mrko",
                        List.of(
                                List.of("donut", "andole"),
                                List.of("donut", "jun"),
                                List.of("donut", "mrko"),
                                List.of("shakevan", "andole"),
                                List.of("shakevan", "jun"),
                                List.of("shakevan", "mrko")),
                        List.of("donut", "shakevan")
                )
        );
    }
}
