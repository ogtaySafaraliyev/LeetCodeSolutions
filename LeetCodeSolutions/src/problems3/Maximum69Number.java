package problems3;

public class Maximum69Number {
	public int maximum69Number (int num) {
        String number = String.valueOf(num);        
        int ans = 0;
        int once = 0;

        for(int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            if(once == 0 && digit == 6) {
                digit = 9;
                once++;
            }
            ans = ans * 10 + digit;          
        }
        return ans;
    }
}
