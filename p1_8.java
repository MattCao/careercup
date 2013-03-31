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
 *
 */
public class p1_8 {
    public static void main (String args[]) {
        String a = "waterbottle";
        String b = "erbottlewat";
        if(isSubstring(a, b)) {
            System.out.println("Yes," + a + " is the substring of " + b);
        } else {
            System.out.println("No," + a + " is not the substring of " + b);
        }
    }

    public static boolean isSubstring(String a, String b) {
        int start = 0;

        if((a == null) || (b == null)) {
            System.out.println("1");
            return false;
        }
        if( a.length() != b.length()) {
            System.out.println("2");
            return false;
        }
        for(int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(start)) {
                boolean flag = true;
                int index = 1;
                for (int j = i + 1; j < a.length(); j++, index++) {
                    if (a.charAt(j) != b.charAt(index)) {
                        System.out.println("3");
                        flag = false;
                        j = a.length();
                    }
                }
                int j = index;
                for (index = 0; j < b.length(); j++, index++) {
                    if (a.charAt(index) != b.charAt(j)) {
                        System.out.println("4");
                        flag = false;
                        j = b.length();
                    }
                }
                if(flag) {
                    return true;
                }
            }
        }
        return false;
    }
}