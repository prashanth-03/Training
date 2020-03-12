import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BEST {
    static int[] bits = {0, 1, 1, 2, 1, 2, 2,
            3, 1, 2, 2, 3, 2, 3, 3, 4};

    static int count_single(int n) {
        int nibble = 0;
        if (n == 0)
            return bits[0];
        else {
            nibble = n & 0xf;
            return bits[nibble] + count_single(n >> 4);
        }
    }


    static int[] count(int n) {
        int res[] = new int[n + 1];
        for (int i = 0; i <= n; i++)
            res[i] = count_single(i);

        return res;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\user\\Desktop\\input5.txt");
        File output = new File("C:\\Users\\user\\Desktop\\output5.txt");
        Scanner br = new Scanner(new FileReader(input));
        Scanner br1 = new Scanner(new FileReader(output));
        String s;

        System.out.println("Actual output:");
        while (br.hasNext()) {

            int a = br.nextInt();
            int[] res = count(a);

            for (int i = 0; i < res.length; i++)
                System.out.print(res[i] + " ");
            System.out.println();
        }
        System.out.println("\nEXPECTED output:");
        while (br1.hasNext()) {

            System.out.print(br1.nextLine() + "\n");



        }
    }
}
