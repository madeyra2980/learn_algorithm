import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SumBetween1AndN {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("INPUT.TXT"));
        int N = sc.nextInt();
        sc.close();

        int sum = 0;

        if (N > 0) {
            sum = N * (N + 1) / 2;
        } else {
            sum = (1 + N) * (1 - N + 1) / 2;
        }

        FileWriter writer = new FileWriter("OUTPUT.TXT");
        writer.write(Integer.toString(sum));
        writer.close();
    }
}
