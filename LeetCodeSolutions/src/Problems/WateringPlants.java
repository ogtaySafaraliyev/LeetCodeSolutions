package Problems;

public class WateringPlants {
    public int wateringPlants(int[] plants, int capacity) {
        int totalSteps = 0;
        int currentCapacity = capacity;

        for(int i=0;  i<plants.length;  i++) {
            if(plants[i] <= currentCapacity) {
                currentCapacity -= plants[i]; 
                totalSteps++;
            }
            else {
                currentCapacity = capacity - plants[i];
                totalSteps += 2*i + 1;
            }
        }
        return totalSteps;
    }
}
