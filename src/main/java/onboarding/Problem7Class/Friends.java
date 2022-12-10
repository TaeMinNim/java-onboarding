package onboarding.Problem7Class;

import java.util.ArrayList;
import java.util.List;

public class Friends {
    private final static int LEFT = 0;
    private final static int RIGHT = 1;

    private final List<List<String>> friends;

    public Friends(List<List<String>> friends){
        this.friends = friends;
    }

    public List<String> findUserFriends(String user){
        List<String> userFriends = new ArrayList<>();
        for(List<String> friend: friends){
            if(friend.contains(user)){
                int index = side(friend.indexOf(user));
                String userFriend = friend.get(index);
                userFriends.add(userFriend);
            }
        }

        return userFriends;
    }

    private int side(int index){
        if(index == LEFT){
            return RIGHT;
        }
        return LEFT;
    }
}
