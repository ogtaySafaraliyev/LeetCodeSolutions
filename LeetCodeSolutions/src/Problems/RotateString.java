package Problems;

public class RotateString {
	public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }

        String total = s + s;
        return total.contains(goal);
    }
}
