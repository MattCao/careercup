//Given two strings, write a method to decide if one is a permutation of the other.
//the idea of this design is using bitmap to realize the function
//problem in the previous design is that:
//didn't consider the situation that one chracter happen to be more than 1 time
//so here, not use the boolean bitmap, using the int bitmap will solve the problem
public static boolean checkup(String strA, String strB) {
	// if at least one of them are null, return false
	if(strA==null || strB==null)
		return false;
	// length is not the same, then return false
	if(strA.length() != strB.length())
		return false;
	// bitmap for ASCII 
	int[] bitmap = new int[256];
	// increase 1 if suffers a match
	for(int i=0; i < strA.length();i++) 
		bitmap[strA.charAt(i)]++;
	// decrease 1 if suffers a match
	for(int i=0; i < strB.length();i++)
		bitmap[strB.charAt(i)]--;
	// should be all zeros if is permutation
	for(int i=0; i < strA.length(); i++) {
		if(bitmap[i] != 0)
			return false;
	}
	return true;
}