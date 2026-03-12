package Problems;

public class ComplementOfBase10Integer {
    public int bitwiseComplement(int n) {
        String binary = decimalToBinary(n);
        String complmnt = complement(binary);
        return binaryToDecimal(complmnt);
    }

    // decimal -> binary
    public static String decimalToBinary(int n) {
        if (n == 0)
            return "0";

        String result = "";

        while (n > 0) {
            result = (n % 2) + result;
            n /= 2;
        }

        return result;
    }

    // binary -> complement
    public static String complement(String binary) {

        String result = "";

        for (char c : binary.toCharArray()) {
            if (c == '0') {
                result += '1';
            } else {
                result += '0';
            }
        }

        return result;
    }

    // binary -> decimal
    public static int binaryToDecimal(String binary) {

        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            decimal += bit * Math.pow(2, power);
            power++;
        }

        return decimal;
    }
}
