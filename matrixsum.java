public class matrixsum {
    public static void main(String[] args) {
        int arr1[][] = {{3,4,5},{6,7,8},{4,6,7}};
        int arr2[][] = {{4,8,9},{3,1,1},{7,9,0}};
        int arr3[][] = new int[3][3];
        
        for(int i =0; i<arr3.length; i++){
            for(int j =0; j<arr3.length; j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for(int i =0; i<arr3.length; i++){
            for(int j =0; j<arr3.length; j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
