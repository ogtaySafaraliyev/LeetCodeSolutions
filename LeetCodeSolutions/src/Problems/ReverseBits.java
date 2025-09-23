package Problems;

public class ReverseBits {
    public int reverseBits(int n) {
        String binaryNumStr = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');

        StringBuilder strBldr = new StringBuilder(binaryNumStr);
        String reversedBinary = strBldr.reverse().toString();

        return Integer.parseInt(reversedBinary, 2);

    }

    public static int binaryToDecimalManual(String binary) {
        int decimal = 0;
        int power = 0;

        // Process from right to left
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        return decimal;
    }
}
