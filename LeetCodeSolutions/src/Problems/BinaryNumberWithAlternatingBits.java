package Problems;

public class BinaryNumberWithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        String number = decimalToBinary(n);
        return (number.contains("11") || number.contains("00")) ? false : true;
    }

    private String decimalToBinary(int num) {
        StringBuilder number = new StringBuilder();

        while (num > 0) {
            number.insert(0, num % 2);
            num /= 2;
        }

        return number.toString();
    }
}
