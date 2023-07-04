public class SecondMaxValue {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 4, 1, 5, 6, 7, 9, 89, 45, 23, 89, 86};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > first) {
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        System.out.println("First => " + first);
        System.out.println("Second => " + second);
    }
}
