import java.util.*;

public class CheckAnagram {
    public static boolean checkAnagram(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;

        char array[] = str1.toCharArray();
        Arrays.sort(array);
        str1 = new String(array);
        

        array = str2.toCharArray();
        Arrays.sort(array);
        str2 = new String(array);

        for(int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "gram";
        String str2 = "armg";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(checkAnagram(str1, str2)) {
            System.out.println("They are anagrams");
        }
        else {
            System.out.println("They are not anagrams");
        }
    }
}
