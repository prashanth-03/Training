import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BEST5 {

    static int min_diff(int arr1[], int arr2[], int arr3[], int n)
    {

        int a=0, b=0, c=0,i = 0, j = 0, k = 0;
        int res =Integer.MAX_VALUE;
        while (i < n && j < n && k < n)
        {
            int sum = arr1[i] + arr2[j] + arr3[k];
            int max = Math.max(Math.max(arr1[i], arr2[j]), arr3[k]);
            int min =  Math.min(Math.min(arr1[i], arr2[j]), arr3[k]);
            int temp=max-min;
            if (min == arr1[i])
            {
                i++;
            }
            else if (min == arr2[j])
            {
                j++;
            }
            else {
                k++;
            }
            if (res > temp)
            {
                res = temp;
                c = max;
                b= sum - (max + min);
                a = min;
            }
        }
        return res;
    }

    public static void main (String[] args) throws FileNotFoundException
    {

        File f=new File("C:\\Users\\user\\Desktop\\INPUT5.txt");
        Scanner input=new Scanner(new FileReader(f));
        File f1=new File("C:\\Users\\user\\Desktop\\OUTPUT5.txt");
        Scanner output=new Scanner(new FileReader(f1));
        String s1=input.nextLine();
        String s2=input.nextLine();
        String s3=input.nextLine();
        String []s11=s1.split(" ");
        String []s22=s2.split(" ");
        String []s33=s3.split(" ");
        int []a1=new int[s11.length];
        int []a2=new int[s22.length];
        int []a3=new int[s33.length];
        for(int i=0;i<s11.length;i++)
        {
            a1[i] = Integer.parseInt(s11[i]);
        }
        for(int i=0;i<s22.length;i++)
        {
            a2[i] = Integer.parseInt(s22[i]);
        }
        for(int i=0;i<s33.length;i++)
        {
            a3[i] = Integer.parseInt(s33[i]);
        }
        int l1 = a1.length;
        int l2 = a2.length;
        int l3 = a3.length;
        int n=Math.max(Math.max(l1,l2),l3);
     int res= min_diff(a1, a2, a3, n-1);
  //ACTUAL OUTPUT
        System.out.println(res);
        //EXPEXTED OUTPUT
        System.out.println(output.nextLine());
    }
}


