public class binarySearch {

    public static void main(String[] args) { 

        int[] arrays = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int item = 5;
        int start = 0;  
        int end = arrays.length - 1;
        
        while (start <= end) { 
            int middle = (start + end) / 2;

            if (arrays[middle] == item) { 
                System.out.println("Element found at index: " + middle);
                return;
            }

            if (arrays[middle] > item) { 
                end = middle - 1;
            } else { 
                start = middle + 1;
            }
        }

        System.out.println("Element not found in the array.");
    }       
}
