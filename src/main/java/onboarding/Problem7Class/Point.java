package onboarding.Problem7Class;

import java.util.HashMap;

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
}
