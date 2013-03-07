/*
 *Write a method to replace all spaces in a string with '%20'. You may assume 
 *that the string has sufficient space at the end of the string to hold the 
 *additional characters, and that you are given the "true" length of the string. 
 *(Note: if implementing in Java, please use a character array so you can perform this operation in place.) 
 Analysis:
 in java, use the character array, so the problem is that replace the space to be '%20', it will add 
 another array element, this will cause the re-arrangement of the array, 
 the normal way to do that is: scan the string to find the space number and build the corresponding 
 length of array, then copy the array element into and also the space element. In time (n+n), so O(n), in 
 space O(n)
 */
public static char[] changing(char[] strArray) {
	int spaceNum;
	for(int i=0; i < strArray.length; i++) {
		if(strArray[i] == " ")
			spaceNum++;
	}
	int len = strArray.length + 2*spaceNum;

	char[] result = new char[len];
	for(int i = -1, int j = -1; j < (strArray.length - 1); ) {
		if(strArray[j++] == " ") {
			result[i++] = "%";
			result[i++] = "2";
			result[i++] = "0";
		} else
			result[i++] = strArray[j];
	}
	return result;
}