package onboarding.Problem7Class;

import java.util.*;

public class PointComparator implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String,Integer> p1, Map.Entry<String,Integer> p2){
        if(p1.getValue() < p2.getValue()){
            return 1;
        } else if(p1.getValue() > p2.getValue()){
            return -1;
        } else{
            return p1.getKey().compareTo(p2.getKey());
        }
    }
}
