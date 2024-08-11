public class leftOrRightItems {
    
    public static void main(String[]args){ 

        int[] arrays = new int[]{1,2,3,4,5,6};
        int start = 0;
        int end = arrays.length-1;

        int middleIndex = (start + end) / 2;
        System.out.println(arrays[middleIndex]);

    }

}
