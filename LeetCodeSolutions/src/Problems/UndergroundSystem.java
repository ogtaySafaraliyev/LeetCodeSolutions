package Problems;

import java.util.*;

class UndergroundSystem {
    private HashMap<Integer, Integer> checkTimeMap = new HashMap<>();

    private HashMap<Integer, String> checkStationNameMap = new HashMap<>();

    private HashMap<String, int[]> mainMap = new HashMap<>();

    public UndergroundSystem() {
        
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkTimeMap.put(id, t);
        checkStationNameMap.put(id, stationName);        
    }
    
    public void checkOut(int id, String stationName, int t) {
        
        String routeKey = checkStationNameMap.get(id) + "-" + stationName;

        int[] twoDimentionalArr = mainMap.getOrDefault(routeKey, (new int[2]));

        twoDimentionalArr[0] += (t - checkTimeMap.get(id));
        twoDimentionalArr[1]++; 

        mainMap.put(routeKey, twoDimentionalArr);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String routeKey = startStation + "-" + endStation;
        int[] twoDimentionalArr = mainMap.get(routeKey);
        return (double) twoDimentionalArr[0] / twoDimentionalArr[1];

    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
