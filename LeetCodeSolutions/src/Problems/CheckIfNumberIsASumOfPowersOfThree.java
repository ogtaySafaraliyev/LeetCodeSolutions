package Problems;

public class CheckIfNumberIsASumOfPowersOfThree {
	public boolean checkPowersOfThree(int n) {
        boolean isYeah = true;

        for(;n > 0;) {
            if(n % 3 > 1) {
                isYeah = false;
            }
            n /= 3;
        }

        return isYeah;
    }
}
