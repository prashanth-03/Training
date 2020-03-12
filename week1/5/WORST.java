import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WORST {
    static int[] count(int n) {
        int res[] = new int[n + 1];
        int k = 0;
        for (int i = 0; i <= n; i++) {
            int temp = i, c = 0;
            while (temp > 0) {
                c += (temp & 1);
                temp = temp >> 1;
            }
            res[k++] = c;
        }
        return res;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File input1 = new File("C:\\Users\\user\\Desktop\\input5.txt");
        File output = new File("C:\\Users\\user\\Desktop\\output5.txt");
        Scanner br = new Scanner(new FileReader(input1));
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