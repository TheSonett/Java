public class CountBasedOnOccurence {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        str = str.toLowerCase();
        
        int[] frequency = new int[26];
        frequency[str.charAt(0) - 'a']++;
        
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(i - 1)) {
                int index = str.charAt(i) - 'a';
                frequency[index]++;
            }
        }

        int count = 0;
        int N = 2;
        
        for(int i : frequency) {
            System.out.print(i + " ");
            if(i == N)
                count ++;
        }
        System.out.println();

        System.out.println(count);
    }
}
