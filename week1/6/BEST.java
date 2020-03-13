import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class BEST {
    static int single_element(Map<Integer,Integer >temp)
    {
        for(Map.Entry<Integer,Integer> entry: temp.entrySet())
        {
            if(entry.getValue()==1)
            {
                return entry.getKey();
            }
        }
        return  0;
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        Map<Integer,Integer> h=new HashMap<>();
        File f=new File("C:\\Users\\user\\Desktop\\input6.txt");
        Scanner sc=new Scanner(new FileReader(f));
        File f1=new File("C:\\Users\\user\\Desktop\\output6.txt");
        Scanner sc1=new Scanner((new FileReader(f1)));
        int i=0;
        int []arr=new int[50];
        while(sc.hasNext()) {
            int k =sc.nextInt();
            if(h.get(k)==null)
            {
                h.put(k,1);
            }
            else
            {
                h.put(k,2);
            }
        }
        int k=single_element(h);
        System.out.println("Actual output: "+k);
        while(sc1.hasNext())
        {
            System.out.print("\nExpected output: "+ sc1.nextInt());
        }
    }

    }

