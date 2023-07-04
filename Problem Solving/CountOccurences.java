import java.util.*;

public class CountOccurences {
     public static void main(String[] args) {
        String str = "AAABBBBBCCDDDDDD";
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        char[] characters = str.toCharArray();
        
        for(char c : characters) {
            // if map contains the character, then just increment it's occurence
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> e : map.entrySet()) {
            System.out.print(e.getKey() + "" + e.getValue());
        }
    }
}
