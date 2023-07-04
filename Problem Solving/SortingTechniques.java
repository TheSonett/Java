public class SortingTechniques {
    // Time complexity -> Wrost Case O(n)^2 | Best Case O(n)
    // Space Complexity -> O(1)
    public static void bubbleSort(int arr[], int n) {
        for(int i = n-1 ; i >= 0; i--) {
            int didSwap = 0;
            for(int j = 0; j <= i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    
                    didSwap = 1;
                }
            }
            
            if(didSwap == 0) {
                break;
            }
            
            System.out.println("running...");
        }
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Time complexity -> Wrost Case O(n)^2 | Best Case O(n)
    // Space Complexity -> O(1)
    public static void selectionSort(int arr[], int n) {
        int min_value = 0;
        for(int i = 0; i < n - 1; i++) {
            min_value = i;
            for(int j = i; j < n; j++) {
                if(arr[j] < arr[min_value]) {
                   min_value = j;
                }
            }

            int t = arr[i];
            arr[i] = arr[min_value];
            arr[min_value] = t;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(int[] arr, int n) {
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            j = i;
            while(j > 0 && arr[j-1] > arr[j]) {
                int t = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = t;

                j--;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 10, 7, 4, 9};
        int n = arr.length;

        insertionSort(arr, n);
    }
}
