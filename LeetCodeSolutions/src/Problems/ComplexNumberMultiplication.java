package Problems;

public class ComplexNumberMultiplication {
    // public String complexNumberMultiply(String num1, String num2) {
    //     String[] arr1 = num1.split("\\+|i");
    //     int real1 = Integer.parseInt(arr1[0]);
    //     int imaginary1 = Integer.parseInt(arr1[1]);

    //     String[] arr2 = num2.split("\\+|i");
    //     int real2 = Integer.parseInt(arr2[0]);
    //     int imaginary2 = Integer.parseInt(arr2[1]);

    //     int onlyReal = (real1 * real2);        
    //     int imaginary = (imaginary1 * imaginary2) * (-1);
    //     int leftSide = onlyReal + imaginary;

    //     int rightSide = (real1 * imaginary2) + (real2 * imaginary1);

    //     return leftSide + "+" + rightSide + "i";
    // }

    public String complexNumberMultiply(String num1, String num2) {
        
        int real1 = findReal(num1);
        int imaginary1 = findImaginary(num1);

        int real2 = findReal(num2);
        int imaginary2 = findImaginary(num2);

        int onlyReal = (real1 * real2);
        int imaginary = (imaginary1 * imaginary2) * (-1);
        int leftSide = onlyReal + imaginary;

        int rightSide = (real1 * imaginary2) + (real2 * imaginary1);

        return leftSide + "+" + rightSide + "i";
    }

    private int findReal(String num) {
        int index = num.indexOf("+");
        return Integer.parseInt(num.substring(0, index));
    }

    private int findImaginary(String num) {
        int indexFirst = num.indexOf("+");
        int indexLast = num.indexOf("i");
        return Integer.parseInt(num.substring(indexFirst + 1, indexLast));
    }

}
