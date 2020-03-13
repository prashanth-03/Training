import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WORST {
    static int maxXOR(int arr[], int n)
    {
        int ans = Integer.MIN_VALUE;

        for (int i=0; i<n; i++)
        {

            int curr = 0;
            for (int j=i; j<n; j++)
            {
                curr = arr[i] ^ arr[j];
                ans = Math.max(ans, curr);
            }
        }
        return ans;
    }

    public static void main(String args[]) throws FileNotFoundException {
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
