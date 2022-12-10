package onboarding.Problem7Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Controller {
    public List<String> recommend(String user, List<List<String>> friendsData, List<String> visitors){
        Friends friends = new Friends(friendsData);
        Point point = new Point();

        List<String> userFriends = friends.findUserFriends(user);
        List<List<String>> friendOfFriend = new ArrayList<>();
        for(String friend: userFriends){
            friendOfFriend.add(friends.findUserFriends(friend));
        }

        for(List<String> friendList: friendOfFriend){
            for(String friend: friendList) {
                point.increase(friend, Point.FRIEND);
            }
        }

        for(String visitor: visitors){
            point.increase(visitor, Point.VISITOR);
        }

        return point.getRecommendFriend(user, userFriends);
    }
}
