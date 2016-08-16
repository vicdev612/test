/**
 * String Rotation
 * Assume you have a method isSubstring which checks if one word is a substring of another.
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call
 * to isSubstring(e.g., "waterbottle" is a rotation of "erbottlewat")
 */

public class Aug050604 {
	public static void main(String[] args) {
		char[] str1 = "watterbottleiswatterbottle".toCharArray();
		char[] str2 = "leiswatterbottlewatterbott".toCharArray();
		int i1 = 0;
		
		for (int i2 = 0; i2 < str1.length; i2++) {
			if (str1[i1] != str2[i2]) {
				i1 = 0;
			}
			
			i1++;
		}
		
		boolean result = false;
		System.out.println("i1=" + i1);
		System.out.println(str1.length - i1);
		
		if (i1 > 0) {
			int len = str1.length - i1;
			for (int i = 0; i < len; i++, i1++) {
				if (str1[i1] != str2[i]) {
					System.out.println(false);
					return;
				}
				
				System.out.println(str1[i1] + "/" + str2[i]);
			}
			
			result = true;
		}
		
		System.out.println(result);
	}
}
