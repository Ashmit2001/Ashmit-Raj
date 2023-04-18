package tophundread.newoops.pesudo;

public class amcatcondiotional {
    public static void main(String[] args) {
        int arr[] = {81,61,51,41,11};
        int n = arr.length;
        fun1(arr,n);
    }

    public static void fun1(int arr[], int n){
        for(int i = 0; i<n; i++){
            if(arr[i]>10 && arr[i]<=40){
                System.out.print("F"+" ");
            }else if(arr[i]>40 && arr[i]<=50){
                 System.out.print("C"+" ");
            }else if(arr[i]>50 && arr[i]<=60){
                System.out.print("B"+" ");
            }
            else if(arr[i]>60 && arr[i]<=80){
                System.out.print("A"+" ");
            }else if(arr[i]>80 && arr[i]<=100){
                System.out.print("S"+" ");
                
            }
        }
    }
    
}
