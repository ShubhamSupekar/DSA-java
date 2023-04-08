import java.util.Scanner;

//rotate a matrix by 90 degree
// step 1 find transpose of matrix
//step 2 reverse elements of all rows and you 
//will get rotated matrix with 90 degree


public class Rotation_matrix {

    public static void main(String[] args){
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the order of th matrix");
        n = scan.nextInt();

        //declare the matrix
        int matrix[][] = new int[n][n];

        int i,j;
        System.out.println("Enter the elements of matrix "+"("+ n*n+" elements to be entered)");
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                matrix[i][j] = scan.nextInt();

        //Display the elements
        System.out.println("Input matrix is: ");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println(" ");   
        }

        //finding transpose of matrix
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        } 
        System.out.println("Transpose of matrix is: ");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println(" ");   
        }

    }
    
}
