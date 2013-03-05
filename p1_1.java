/*note: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
  author: Matt
  algorithm: sort the string first then check whether it has the same value with the next array value
  */
 public static boolean uniqueCheck(String str) {
  if (str == null) {
    return false;
  }
  
  char[] array = str.toCharArray(); // convert the string to a char array
  // Arrays contains a lot of methods that manipulate the array,like sort and search
  // sort use the tuned quicksort
  Arrays.sort(array); 
  
  for (int i = 0; i < array.length - 1; i ++) {
    if (array[i] == array[i + 1]) {
      return false;
    }
  }
  
  return true;
}
