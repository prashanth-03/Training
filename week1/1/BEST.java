public class BEST {
    public static int result(int arr[], int a, int b)
    {
        if(a==b)
            return arr[b];
        else
            return arr[a]^(result(arr,a+1,b));      // using recursion doesnt make it best approach. It takes same time as worst approach 
    }

    public static void main(String args[])
    {
        //INPUT DATA
        int [] input={1,3,4,8};
        int [][]query={{0,1},{1,2},{0,3},{3,3}};
        System.out.println("Actual output:");
        //SOLUTION
        for(int i=0;i<query.length;i++)
        {
            int k = result(input, query[i][0], query[i][1]);
            System.out.print(k+" ");
        }
        //EXPECTED OUTPUT
        int []expected={2,7,14,8};
        System.out.println("\nExpected Output:");
        for(int i=0;i<expected.length;i++)
        {
            System.out.print(expected[i]+" ");
        }
    }
}
