import java.util.Scanner;


public class rowsumcolsum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter size");
                int m = sc.nextInt();
                int n = sc.nextInt();
                System.out.println("enter elements");
               int arr[][] = new int[m][n];
               for(int i =0; i<m; i++){
                for(int j =0; j<n; j++){
                    arr[i][j] = sc.nextInt();
                }
               }
               for(int i =0; i<m; i++){
                for(int j =0; j<n; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
               }

               
               for(int i =0; i<m; i++){
                int rowsum = 0;
                for(int j =0; j<n; j++){
                   rowsum +=arr[i][j];
                }
                System.out.println(rowsum);
               }
               
              
               for(int j =0; j<n; j++){
                int colsum = 0;
                for(int i =0; i<m; i++){
                   colsum +=arr[i][j];
                }
                System.out.println(colsum);
               }
               
        }
    }
    
}
