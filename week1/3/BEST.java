import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
class BEST
{

    static int maxXOR(int arr[], int n)
    {
        int max = 0, mask = 0;

        HashSet<Integer> se = new HashSet<Integer>();

        for (int i = 30; i >= 0; i--)
        {

            mask |= (1 << i);
            for (int j = 0; j < n; ++j)
            {
                se.add(arr[j] & mask);
            }
            int newMax = max | (1 << i);
            for (int prefix : se)
            {
                if (se.contains(newMax ^ prefix))
                {
                    max = newMax;
                    break;
                }
            }
            se.clear();
        }
        return max;
    }


    public static void main(String[] args)throws FileNotFoundException
    {
        File f=new File("C:\\Users\\user\\Desktop\\input3.txt");
        Scanner sc=new Scanner(new FileReader(f));
        File f1=new File("C:\\Users\\user\\Desktop\\output3.txt");
        Scanner sc1=new Scanner((new FileReader(f1)));
        int i=0;
        int []arr=new int[50];
        while(sc.hasNext()) {
            arr[ i++] =sc.nextInt();
        }   int n = arr.length;
        int k=maxXOR(arr,n);
        System.out.println("Actual output: "+k);
        while(sc1.hasNext())
        {
            System.out.print("\nExpected output: "+ sc1.nextInt());
        }
    }
}
