import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }
    
     public static int[] twoSum2(int[] nums, int target) {
         for(int i = 0; i < nums.length; i++) {
             for(int j = i + 1; j < nums.length; j++) {
                 if(nums[i] + nums[j] == target) {
                     return new int[] {i, j};
                 }
             }
         }
         
         return new int[] {-1, -1};
     }
    
    
    public static void main(String[] args) {
        int arr[] = new int[] {4, 3, 1, 6, 3};
        int target = 10;
        
        int[] arr2 = twoSum(arr, target);
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        
    }
}