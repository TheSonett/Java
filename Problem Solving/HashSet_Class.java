import java.util.*;

public class HashSet_Class {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        nums.add(23);
        nums.add(45);
        nums.add(12);
        nums.add(56);
        nums.add(43);
        nums.add(23);
        nums.add(12);
        
        System.out.println(nums + "\n");
        
        if(nums.contains(55)) {
            System.out.println("Present in the set");
        }
        else {
            System.out.println("Not present in the set");
        }
        
        nums.remove(23);
        System.out.println("\n" + nums);
    }
}
