/**
 * String Compression
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, aabcccaaa should become a2b1c5a3. If the "compressed" string would not become smaller than the original,
 * your method should return the original string. You can assume the string only has uppercase and lowercase letters.
 */

youtube: "gayle coding interview"
string rotation
	
public class Aug050601 {
	static char[] output = null;
	static int oIdx = 0;
	
	private static void addStr(char prv, int cnt) {
		output[oIdx++] = prv;
		
//		if (cnt == 1) {
//			return;
//		}
		
		char[] clen = (cnt + "").toCharArray();
		
		for (int j = 0; j < clen.length; j++) {
			output[oIdx++] = clen[j];
		}
	}
	
	public static void main(String[] args) {
		String str = "aabcccaaa";
		char[] input = str.toCharArray();
		output = new char[2 * input.length];
		int cnt = 1;
		char prv = input[0];
		
		for (int i = 1; i < input.length; i++) {
			if (prv != input[i]) {
				addStr(prv, cnt);
				
				prv = input[i];
				cnt = 1;
				continue;
			}
			
			cnt++;
		}
		
		addStr(prv, cnt);
		
		String result = (oIdx < input.length) ? new String(output, 0, oIdx) : str;
		
//		System.out.println(Arrays.toString(output) + oIdx + "," + input.length);
		System.out.println(str);
		System.out.println(result);
	}
}
