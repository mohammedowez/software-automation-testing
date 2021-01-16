import java.util.Scanner;

public class Matrix_Mult {
    public static void main(String args[])
    {
        int m,n,m1,n1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the order of  matrix A");
        m = input.nextInt();
        n = input.nextInt();
        System.out.println("Enter the order of  matrix B");
        m1 = input.nextInt();
        n1= input.nextInt();
        if(n==m1)
        {
            int[][] a = new int[m][n];
            int[][] b = new int[m1][n1];
            int[][] c = new int[m][n1];
            System.out.println("Enter the elements of 1st martix row wise \n");
            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    a[i][j] = input.nextInt();
                }
            }
            System.out.println("Enter the elements of 2nd martix row wise \n");
            for (int i = 0; i < m1; i++)
            {
                for (int j = 0; j < n1; j++)
                {
                    b[i][j] = input.nextInt();
                }
            }
            System.out.println("Multiplying the matrices...");
            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < n1; j++)
                {
                    c[i][j]=0;
                    for (int k = 0; k < n; k++)
                    {
                        c[i][j] = c[i][j] + a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("The product is:");
            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < n1; j++)
                {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
            input.close();
        }
        else
            System.out.println("matrix multiplication not possile");
    }
}
