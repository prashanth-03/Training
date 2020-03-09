public class BEST
{
    static int  min_replacements(int n)
    {
        int c=0;
        while(n!=1)
        {
            if((n&1)==1) {
                n= n - 1;
                c++;
            }
            n= n>>1;
            c++;

        }
        return c;
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
        int []expected_out={3,6,8,10,0,11,9,10};
        System.out.println("\nExpected output:");
        for(int i:expected_out)
            System.out.print(i+" ");


    }
}
