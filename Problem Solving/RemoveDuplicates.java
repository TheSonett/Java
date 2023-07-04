import java.util.*;

public class RemoveDuplicates {
    public static void removeDuplicateFromUnsortedArray(int A[], int N) {
        Set<Integer> hs = new LinkedHashSet<>();
    
        for(int x : A){
            hs.add(x);
        }
        
        int[] arr = new int[hs.size()];
        int i = 0;
        for(int x : hs){
            arr[i++] = x;
        }
        
        for(int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static int countUniqueElements(int arr[], int N) {
        int count = 1;
        int i = 0;

        for(int k = 1; k < N; k++) {
            if(arr[i] != arr[k]) {
                arr[++i] = arr[k];
                count++;
            }
        }

        if(arr.length == 0) {
            return 0;
        }

       
        System.out.println();

        return count;
    }

    public static void removeDuplicateFromSortedArray(int A[], int N) {
        Set<Integer> hs = new TreeSet<>();
    
        for(int x : A){
            hs.add(x);
        }
        
        int[] arr = new int[hs.size()];
        int i = 0;
        for(int x : hs){
            arr[i++] = x;
        }
        
        for(int j : arr) {
            System.out.print(j + " ");
        }
    }

    String removeDups(String S) {
        String result = "";
        
        Set<Character> myChars = new LinkedHashSet<>();
        for(int i = 0; i < S.length(); i++) {
            myChars.add(S.charAt(i));
        }
        
        Iterator<Character> it = myChars.iterator();
        while(it.hasNext()) {
            result += it.next();
        }
        
        return result;
    }
    
    public static void main(String[] args) {
       int[] arr = new int[] { 1, 3, 2, 1, 4, 3, 5, 5, 2, 3, 1, 6};
       removeDuplicateFromUnsortedArray(arr, arr.length);

       System.out.println();
       //Arrays.sort(arr);
       //System.out.println(countUniqueElements(arr, arr.length));

       removeDuplicateFromSortedArray(arr, arr.length);

    }
}
