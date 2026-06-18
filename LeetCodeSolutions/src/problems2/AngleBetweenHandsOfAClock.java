package problems2;

public class AngleBetweenHandsOfAClock {
    public double angleClock(int hour, int minutes) {
        double hourangle = hour * 30 + minutes * 0.5;

        double minutesAngle = minutes * 6.0;

        double ans = Math.abs(hourangle - minutesAngle);

        return Math.min(ans, 360.0 - ans);
    }
}
