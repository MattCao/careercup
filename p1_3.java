//Given two strings, write a method to decide if one is a permutation of the other.
//the idea of this design is using bitmap to realize the function
public static boolean checkup(String strA, String strB) {
	// if at least one of them are null, return false
	if(strA==null || strB==null)
		return false;
	// length is not the same, then return false
	if(strA.length() != strB.length())
		return false;
	// bitmap for ASCII 
	boolean bitmap = new boolean[256];
	// make the stringA characters to be ture
	for(int i=0 ;i < strA.length();i++) 
		bitmap[strA.charAt(i)] = true;
	// if stirngB characters bitmap has value false, then return false
	for(int i=0 ;i < strB.length();i++)
		if(!bitmap[strB.charAt(i)])
			return false;
	return true;
}