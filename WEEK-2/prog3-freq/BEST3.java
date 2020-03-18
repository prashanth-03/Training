import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BEST3 {
    static int l_index=0;
    static int f=0;
    static int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1);
        for (int j=low; j<high; j++) 
        { 
            if (arr[j] < pivot) 
            { 
                i++; 
  
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
  
    static void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
           int pi = partition(arr, low, high); 
  
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    }
    static void find(int a[],int low,int high,int k)
    {	
	    if(low>high)
	    return;
	    int mid=(low+high)/2;
        if(a[mid]==k)
	    {
	        l_index=mid;
            high=mid-1;
	        f=1;
        }
	    else if(a[mid]>k)
        {
        	find(a,low,mid-1,k);
	    }
	    else
	    {
	    	find(a,mid+1,high,k);        	
        }
    }
 
    public static void main(String[] args) throws FileNotFoundException
    {
        File input = new File("C:\\Users\\user\\Desktop\\input3.txt");
        File output = new File("C:\\Users\\user\\Desktop\\output3.txt");
        Scanner sc = new Scanner(new FileReader(input));
        Scanner sc1 = new Scanner(new FileReader(output));

        int i=0,c=0;
        int k=sc.nextInt();
        int []a=new int[100];
        while(sc.hasNext())
        {
            a[i]=sc.nextInt();
            i++;
        }
        int l=i-1;
    	sort(a,0,l);
        find(a,0,l,k);
	    if(f==1)
	    {
		    for(i=l_index;i<=l;i++)
		    {
			    if(a[i]!=k)
		    	break;
			    c++;
		    }
	    }
        //ACTUAL OUTPUT
        System.out.println(c);
        //EXPECTED OUTPUT
        System.out.println(sc1.nextLine());
    }
}
