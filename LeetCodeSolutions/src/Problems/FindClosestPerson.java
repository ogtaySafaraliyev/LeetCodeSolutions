package Problems;

public class FindClosestPerson {
    public int findClosest(int x, int y, int z) {
        int diffX = Math.abs(z - x);
        int diffY = Math.abs(z - y);
        int ans = 0;

        if(diffX < diffY) {
            ans = 1;
        }

        else if(diffX > diffY) {
            ans = 2;
        }
        return ans;
    }
}
