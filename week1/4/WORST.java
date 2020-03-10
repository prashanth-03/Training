public class WORST {            // will give wrong output
    static int  replacement1(int n,int a)
    {
            int c = 0;
            while (n != 1)
            {
                if (n % 2 == 0)
                {
                    n = n / 2;
                    c++;
                }
                else
                {
                    if(a==1)        // when will u do n+1 
                    n -= 1; 
                    else
                      n+=1;  
                    c++;
                }
            }
            return c;
    }
      
    public static void main(String args[])
    {
        int []input={8,21,100,63,1,123,99,201};//INPUT DATA
        System.out.println("Actual output:");
        //SOLUTION
        for(int i:input)
        {
                int ans=min_replacements(i,0);
                      int ans1=min_replacements(i,1);
                System.out.print(Math.min(ans,ans1)+" ");
            }
        //EXPECTED OUTPUT
        int []expected_out={3,6,8,7,0,9,9,10};
        System.out.println("\nExpected output:");
        for(int i:expected_out)
            System.out.print(i+" ");
    }

}
