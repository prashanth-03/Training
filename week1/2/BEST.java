import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BEST {
    static int count(int a,int b,int c)
    {
        int count = 0, x, y, z;
        while (a != 0 || b != 0 || c != 0) {
            x = a & 1;
            y = b & 1;
            z = c & 1;
            if ((x | y) != z) {
                if (x == 1 && y == 1)
                    count += 2;
                else
                    count += 1;
            }
            a = a >> 1;
            b = b >> 1;
            c = c >> 1;
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        File input = new File("C:\\Users\\user\\Desktop\\input.txt");
        File output = new File("C:\\Users\\user\\Desktop\\output.txt");
        Scanner br = new Scanner(new FileReader(input));
        Scanner br1 = new Scanner(new FileReader(output));
        String s;
	//SOLUTION
        System.out.println("Actual output:");
        while (br.hasNext()) {

            int a = br.nextInt();
            int b = br.nextInt();
            int c = br.nextInt();
            int res=count(a,b,c);
                      System.out.print(res+" ");
        }
	//EXPECTED OUTPUT
        System.out.println(("\nExpexted output:"));
        while (br1.hasNext())
            System.out.print(br1.nextInt()+" ");

        }
    }

