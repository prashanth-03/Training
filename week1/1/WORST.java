public class WORST {
        public static void main(String args[])
        {
            //INPUT DATA
            int [] input={1,3,4,8};
            int [][] query={{0,1},{1,2},{0,3},{3,3}};
            System.out.println("Actual output:");
            //SOLUTION
            for(int i=0;i<query.length;i++)
            {
                int k=0;						// variable name inappropriate
                for(int j= query[i][0];j<= query[i][1];j++)		// use curly braces
                    k^=input[j];
		k=k^0;   
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

