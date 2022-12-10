package onboarding.Problem7Class;

import java.util.*;

public class Point {
    public final static int FRIEND = 10;
    public final static int VISITOR = 1;

    private final HashMap<String, Integer> pointMap = new HashMap<>();

    public void increase(String user, int point){
        if(!pointMap.containsKey(user)){
            pointMap.put(user, 0);
        }
        int updatedPoint = pointMap.get(user) + point;
        pointMap.replace(user, updatedPoint);
    }

    public List<String> getRecommendFriend(){
        List<Map.Entry<String, Integer>> friends = new ArrayList<>(pointMap.entrySet());
        Collections.sort(friends, new PointComparator());

        List<String> recommendFriend = new ArrayList<>();
        for(Map.Entry<String, Integer> friend: friends){
            recommendFriend.add(friend.getKey());
        }

        return recommendFriend;
    }
}
