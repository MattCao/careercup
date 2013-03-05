  /* Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
   * Time complexity : O(N) Space complexity : O(N)
   * Use the bitmap
  */
	public static boolean uniqueCheck_A(string str) {
		if (str == null) {
    	  return false;
  		}
  		char[] array = str.toCharArray();
		int length = array.length;
		/*
		 * Assume that the string is in ASCII. one byte
		 * In case of Unicode, the size of array should be 65535. UTF-16
		 */
		boolean[] charMap = new boolean[256];
		for(int i = 0; i < length; i++) {
			int index = array[i];
			if(charMap[index]) return false;
			charMap[index] = true;
		}
		return true;
	/* Use the charAt[] function constant access
	 */
	public static boolean uniqueCheck_B(string str) {
		if (str == null) {
    	  return false;
  		}
		/*
		 * Assume that the string is in ASCII. one byte
		 * In case of Unicode, the size of array should be 65535. UTF-16
		 */
		boolean[] charMap = new boolean[256];
		for(int i = 0; i < str.length(); i++) {
			int index = str.charAt[i];
			if(charMap[index]) return false;
			charMap[index] = true;
		}
		return true;
	}