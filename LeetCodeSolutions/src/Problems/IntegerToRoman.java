package Problems;
import java.util.*;

public class IntegerToRoman {
	// public String intToRoman(int num) {      

    //     String[] symbols = {"I", "IV", "V", "IX", 
    //                         "X", "XL", "L", "XC", 
    //                         "C", "CD", "D", "CM", 
    //                         "M"};
                            
    //     int[] values = {1, 4, 5, 9, 
    //                     10, 40, 50, 90, 
    //                     100, 400, 500, 900, 
    //                     1000};

    //     StringBuilder strBldr = new StringBuilder();
        
    //     for(int i = 12; i >= 0;  i--) {
    //         while(num >= values[i]) {
    //             strBldr.append(symbols[i]);
    //             num -= values[i];
    //         }
    //     }
    //     return strBldr.toString();    

    // }

    public String intToRoman(int num) {    
        TreeMap<Integer, String> hshMap = new TreeMap<>(Comparator.reverseOrder());
        
        hshMap.put(1, "I");
        hshMap.put(4, "IV");                
        hshMap.put(5, "V");
        hshMap.put(9, "IX");

        hshMap.put(10, "X");
        hshMap.put(40, "XL");                
        hshMap.put(50, "L");        
        hshMap.put(90, "XC");   

        hshMap.put(100, "C");
        hshMap.put(400, "CD");
        hshMap.put(500, "D");
        hshMap.put(900, "CM");
        hshMap.put(1000, "M");
        
        StringBuilder strBldr = new StringBuilder();

        for(var element: hshMap.entrySet()) {
            int value = element.getKey();
            String symbol = element.getValue();

            while(num >= value) {
                num -= value;
                strBldr.append(symbol);
            }
        }
        return strBldr.toString();

    }
}
