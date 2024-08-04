import java.util.Arrays;

/**
 * minAndMax
 */
public class minAndMax {

    public static void main(String[] args) {
        minAndMax instance = new minAndMax();
        int[] arrays = {1, 2, 3, 4, 5};
        int maxItem = instance.getMaxItem(arrays);
        int minItem = instance.getMinItem(arrays);
        System.out.println("Max item: " + maxItem);
        System.out.println("Max item: " + minItem);
    }

    public int getMaxItem(int[] arrays) {
        int maxValue = arrays[0];

        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i] > maxValue) {
                maxValue = arrays[i];
            }
        }
        return maxValue;
    }
    public int getMinItem(int[] arrays) {
        int minValue = arrays[0];

        for(int i = 0; i < arrays.length; i++){ 
            if(arrays[i] < minValue){ 
                minValue = arrays[i];
            }
        }
        return minValue;
    }
}
