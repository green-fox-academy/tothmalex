import java.io.*;

public class Matrix {
    public static void main(String[] args) {
            int i,j;
            int a[][]=new int[4][4];
            for(i=0;i<4;i++)
            {
                for(j=0;j<4;j++)
                {
                    if(i==j)
                    {
                        a[i][j]=1;
                        System.out.print(" "+a[i][j]);
                    }
                    else
                    {
                    a[i][j]=0;
                    System.out.print(" "+a[i][j]);
                    }
                }
                System.out.print("\n");
                }
    }
}
// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output