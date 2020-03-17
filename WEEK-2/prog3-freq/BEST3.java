import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BEST3 {
    static int c=0;
    static void count(int a[],int n,int k)
    {
        if(n<0)
            return ;
        else
        {
            if(k==a[n])
            {
                c++;
            }
            count(a,n-1,k);

        }
    }
    public static void main(String[] args) throws FileNotFoundException
    {
        File input = new File("C:\\Users\\user\\Desktop\\input3.txt");
        File output = new File("C:\\Users\\user\\Desktop\\output3.txt");
        Scanner sc = new Scanner(new FileReader(input));
        Scanner sc1 = new Scanner(new FileReader(output));

        int i=0;
        int k=sc.nextInt();
        int []a=new int[50];
        while(sc.hasNext())
        {
            a[i]=sc.nextInt();
            i++;
        }
        int l=a.length-1;
        count(a,l,k);
        //ACTUAL OUTPUT
        System.out.println(c);
        //EXPECTED OUTPUT
        System.out.println(sc1.nextLine());
    }
}
