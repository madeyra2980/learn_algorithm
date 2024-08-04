public class linearSearch {
    public static void main(String[] args) {
        linearSearch instance = new linearSearch();
        int[] arrays = {1, 2, 3, 4, 5};
        int valueToFind = 3;
        int index = instance.linearSearch(valueToFind, arrays);
        if (index != -1) {
            System.out.println("Значение " + valueToFind + " Индекс: " + index);
        } else {
            System.out.println("Значение " + valueToFind + " Не найден");
        }
    }

    public int linearSearch(int value, int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == value) {
                return i;
            }
        }
        return -1; 
    }
}
