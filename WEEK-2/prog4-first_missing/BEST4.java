import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BEST4 {
    static int mid=0;
        static int find(int a[],int low,int high) {

            if (low> high) {
                return high + 1;
            }
            if ((low) != a[low] ) {
                return low;
            }
            mid = (low + high) / 2;
            if (a[mid] == mid) {
                return find(a, mid + 1, high);
            }
            return find(a, low+1, mid);

        }
        public static void main(String[] args) throws FileNotFoundException
        {
            File input = new File("C:\\Users\\user\\Desktop\\INPUT4.txt");
            File output = new File("C:\\Users\\user\\Desktop\\output4.txt");
            Scanner sc = new Scanner(new FileReader(input));
            Scanner sc1 = new Scanner(new FileReader(output));

            int i=0,c=0;
            int []a=new int[100];
            while(sc.hasNext())
            {
                a[i]=sc.nextInt();
                i++;
            }
            int l=i-1;
            int m=find(a,0,l);


            //ACTUAL OUTPUT
            System.out.println(m);
            //EXPECTED OUTPUT
           System.out.println(sc1.nextLine());
        }
    }


