package problems3;

public class CheckIfAllAsAppearsBeforeAllBs {
	// public boolean checkString(String s) {
    //     return s.contains("ba") ? false : true;
    // }

    public boolean checkString(String s) {
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length - 1; i++) {
            char first = arr[i];
            char second = arr[i+1];

            if(first == 'b' && second == 'a') {
                return false;
            }
        }
        return true;
    }
}
