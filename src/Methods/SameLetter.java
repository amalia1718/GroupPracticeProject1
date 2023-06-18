package Methods;

import java.util.Arrays;

public class SameLetter {

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "acb";

        //convert the string into char array and sort the arrays . Compare the arrays:

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        if(Arrays.equals(chars1,chars2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
    }
}
