public class BEST    // code wont work and not the best approach as well
{
    static int  min_replacements(int n)
    {
        if(n==1)
            return 0;
        if((n&1)==1)
        {  
            return (1+ Math.min(min_replacements(n-1),min_replacements(n+1)));
        }
        else              
        {
            return (1+ min_replacements(n>>1)); 
        }          
    }
    public static void main(String args[])
    {
        //INPUT DATA
        int []input={8,21,100,63,1,123,99,201};
        System.out.println("Actual output:");
        //SOLUTION
        for(int i:input)
        {
          int c=  min_replacements(i);
            System.out.print(c+" ");
        }
        //EXPECTED OUTPUT
        int []expected_out={3,6,8,7,0,9,9,10};
        System.out.println("\nExpected output:");
        for(int i:expected_out)
            System.out.print(i+" ");


    }
}
