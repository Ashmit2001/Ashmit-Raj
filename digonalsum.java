import java.util.*;
public class digonalsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and col");
        int row =sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("enter elements");
        for(int i =0; i<row; i++){
            for(int j = 0; j<col; j++){
               arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("square matrix");
        for(int i =0; i<row; i++){
            for(int j = 0; j<col; j++){
              System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum1 = 0;  
        int sum2 = 0;
        for(int i =0; i<row; i++){
            for(int j =0; j<col; j++){
                if(i==j){
                sum1 += arr[i][j];
                }if(i+j == row-1){
                    sum2 +=arr[i][j];
                }
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    
    }
}
