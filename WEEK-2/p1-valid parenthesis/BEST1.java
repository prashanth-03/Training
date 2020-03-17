import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class BEST1
{
   
    static long count=0;     
    static void count_parenthesis(char str[], int pos, int n, int open, int close) 
    { 
        if(close == n)  
        { 
       		count++;
        	return; 
        } 
        else
        { 
            if(open > close) { 
                str[pos] = '}'; 
                count_parenthesis(str, pos+1, n, open, close+1); 
            } 
            if(open < n) { 
                str[pos] = '{'; 
                count_parenthesis(str, pos+1, n, open+1, close); 
            } 
        } 
    } 
    public static void main(String[] args) throws FileNotFoundException
    {
        File input=new File("C:\\Users\\user\\Desktop\\INPUT2_1.txt");
        Scanner sc=new Scanner((new FileReader(input)));
        File output=new File("C:\\Users\\user\\Desktop\\OUTPUT2_1.txt");
        Scanner sc1=new Scanner((new FileReader(output)));
        System.out.println("Actual Output:");
        while(sc.hasNext()) 
    	{
        	int n = sc.nextInt();
	    	if(n<=0)
		    {
			    System.out.println("0");
		    }
		    else
		    {	
   			    char[] str = new char[2 * n]; 
			    count=0;
			    count_parenthesis(str, 0, n, 0, 0); 
             	System.out.println(count);
           	}
	    }
        System.out.println("\nExpected Output:");
        while(sc1.hasNext())
        {
            System.out.println(sc1.nextLine());
        }
    }

}
