package Problems;

public class ConvertDateToBinary {
	// public String convertDateToBinary(String date) {
	// String[] strArr = date.split("-");
	// String ans = "";
	// String year = Integer.toBinaryString(Integer.valueOf(strArr[0]));
	// String month = Integer.toBinaryString(Integer.valueOf(strArr[1]));
	// String day = Integer.toBinaryString(Integer.valueOf(strArr[2]));
	// ans = year + "-" + month + "-" + day;
	// return ans;

// }

	public String convertDateToBinary(String date) {
		String[] strArr = date.split("-");
		StringBuilder strBldr = new StringBuilder();

		String year = Integer.toBinaryString(Integer.valueOf(strArr[0]));
		String month = Integer.toBinaryString(Integer.valueOf(strArr[1]));
		String day = Integer.toBinaryString(Integer.valueOf(strArr[2]));
		strBldr.append(year).append("-").append(month).append("-").append(day);

		return strBldr.toString();

	}

}
