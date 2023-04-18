package tophundread.newoops;

import java.util.Arrays;

public class twosumagain {
    public static void main(String arrgs[]){
        int arr[] = {2,9,4,3,1,10,6};
        int n = arr.length;
        int sum = 9;
        fun1(arr , n , sum);

    }
     public static void fun1(int arr[] , int n , int sum){
        Arrays.sort(arr);
        int i = 0;
        int j = n-1;
        while(i<j){
            if(arr[i]+arr[j]>sum){
                j--;
            }
            if(arr[i]+arr[j]<sum){
                i++;
            }
            if(arr[i]+arr[j]==sum){
                System.out.println(arr[i] +" "+arr[j]);
                break;
            }

            }
        }
     }
    

