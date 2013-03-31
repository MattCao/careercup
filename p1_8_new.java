/**
 * Created with IntelliJ IDEA.
 * User: caoyangkaka
 * Date: 3/29/13
 * Time: 12:16 AM
 * To change this template use File | Settings | File Templates.
 */
/*
 *Question:
 * Assume you have a method isSubstring which checks if one word is a substring of another.
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one
 * call to isSubstring (e.g., "waterbottle" is a rotation of "erbottlewat").
 * My idea:
 * is not good since found that the time is N^2, which need improvement
 * Others' idea:
 * WTF, the idea is great, it will do the comparison with a+a with b, it will be more easier to do
 * that. Besides, java String has a functions which is contains, which will do the contains validation
 * check.
 */
public class p1_6 {
    public static void main (String args[]) {
        String a = "waterbottle";
        String b = "erbottlewat";
        if(isValid(a, b)) {
            System.out.println("Yes," + a + " is the substring of " + b);
        } else {
            System.out.println("No," + a + " is not the substring of " + b);
        }
    }

    public static boolean isValid(String a, String b) {
        if(a.length() == 0){
            return false;
        }else if(b.length() == 0) {
            return true;
        }else if(a.length() != b.length()) {
            return false;
        }
        a = a + a;
        return a.contains(b);
    }
}