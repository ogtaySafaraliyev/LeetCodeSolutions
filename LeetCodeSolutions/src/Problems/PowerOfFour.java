package Problems;

public class PowerOfFour {
    // public boolean isPowerOfFour(int n) {
    //     // n = a << b      n = a * Math.pow(2, b)
    //     // n = 4 << b

    //     if (n <= 0 || (n & (n - 1)) != 0) {
    //         return false;
    //     }

    //     // Create a mask with bits set at even positions: 0x55555555
    //     // This is binary: 01010101010101010101010101010101
    //     // We can create this using left shift operations
    //     int mask = 0;
    //     for (int i = 0; i < 32; i += 2) {
    //         mask |= (1 << i);  // Set bit at even positions using left shift
    //     }

    //     // Check if the single bit in n is at an even position
    //     return (n & mask) != 0;       

    // }

    public boolean isPowerOfFour(int n) {
        if (n <= 0)
            return false;            
        
        int power = 1;
        while ( power < n) {
            power = power << 2;
        }
        return power == n;
    }
}
