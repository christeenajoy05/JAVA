import java.util.Scanner;
 
public class SymmetricMatrix
{   
    public static void main(String[] args)
    {
    
        System.out.println("\nName:CHRISTEENA JOY\nReg No:22MCA020\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:28/03/2023\n\n");
        Scanner mat = new Scanner(System.in);
         
        System.out.println("Enter the no. of rows : ");
         
        int rows = mat.nextInt();
         
        System.out.println("Enter the no. of columns : ");
         
        int cols = mat.nextInt();
         
        int matrix[][] = new int[rows][cols];
         
        System.out.println("Enter the elements :");
         
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix[i][j] = mat.nextInt();
            }
        }
         
        System.out.println("The matrix is :");
         
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
             
            System.out.println();
        }
         
         
        if(rows != cols)
        {
            System.out.println("The given matrix is not a square matrix");
        }
        else
        {
            boolean symmetric = true;
             
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    if(matrix[i][j] != matrix[j][i])
                    {
                        symmetric = false;
                        break;
                    }
                }
            }
             
            if(symmetric)
            {
                System.out.println("The given matrix is symmetric.");
            }
            else
            {
                System.out.println("The given matrix is not symmetric.");
            }
        }
         
        mat.close();
    }
}
