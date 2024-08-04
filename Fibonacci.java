public class Fibonacci {

    public static void main(String[] args) {
        int n = 100; 
        // System.out.println("Recursive Fibonacci:");
        // for (int i = 0; i <= n; i++) {
        //     System.out.println("Fibonacci(" + i + ") = " + fibName(i));
        // }

        System.out.println("\nEffective Fibonacci:");
        for (int i = 0; i <= n; i++) {
            System.out.println("Fibonacci(" + i + ") = " + fibEffective(i));
        }
    }

    // Наивный медленный рекурсивный метод
    private static long fibName(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibName(n - 1) + fibName(n - 2);
        }
    }

    // Эффективный итеративный метод
    private static long fibEffective(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }
}
