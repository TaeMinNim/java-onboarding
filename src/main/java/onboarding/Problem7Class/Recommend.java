package onboarding.Problem7Class;

import java.util.ArrayList;
import java.util.List;

public class Recommend {
    private final Friends friends;
    private final String user;
    private final List<String> visitors;

    private final Point point = new Point();

    public Recommend(String user, List<List<String>> friendsData, List<String> visitors) {
        this.friends = new Friends(friendsData);
        this.user = user;
        this.visitors = visitors;
    }

    public List<String> start() {
        List<String> userFriends = friends.findUserFriends(user);
        List<List<String>> userFriendOfFriend = findFriendOfFriend(userFriends);
        calculatePoint(userFriendOfFriend, visitors);

        List<String> recommendFriend = point.getSortedFriends();
        removeSelf(recommendFriend);
        removeFriends(recommendFriend, userFriends);

        return recommendFriend;
    }

    private void removeSelf(List<String> recommendFriend){
        recommendFriend.remove(user);
    }

    private void removeFriends(List<String> recommendFriend, List<String> userFriends){
        for(String friend: userFriends){
            recommendFriend.remove(friend);
        }
    }

    private List<List<String>> findFriendOfFriend (List < String > userFriends) {
        List<List<String>> friendOfFriend = new ArrayList<>();
        for (String friend : userFriends) {
            friendOfFriend.add(friends.findUserFriends(friend));
        }

        return friendOfFriend;
    }

    private void calculatePoint(List<List<String>> userFriendOfFriend, List<String> visitors){
        for (List<String> friendList : userFriendOfFriend) {
            for (String friend : friendList) {
                point.increase(friend, Point.FRIEND);
            }
        }

        for (String visitor : visitors) {
            point.increase(visitor, Point.VISITOR);
        }
    }
}
