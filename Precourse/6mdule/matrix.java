import java.util.Scanner;



public class matrix {
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

    }
}
