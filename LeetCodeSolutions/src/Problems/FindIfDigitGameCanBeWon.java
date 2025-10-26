package Problems;

public class FindIfDigitGameCanBeWon {
    public boolean canAliceWin(int[] nums) {
        int numsAlice = 0;
        int numsBob = 0;

        for(int num: nums) {
            if(defineDigitsIfMoreThanOne(num)) {
                numsAlice += num;
            }
            else{
                numsBob += num;
            }
        }
        return numsAlice != numsBob;
    }

    private boolean defineDigitsIfMoreThanOne(int num) {
        int count = 0;
        while(num > 0) {
            num /= 10;
            count++;
        }
        return (count == 2) ? true : false;
    }
}
