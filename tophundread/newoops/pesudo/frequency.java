package tophundread.newoops.pesudo;

public class frequency {
    public static void main(String[] args) {
        int arr[] = {1,3,6,1,6,7,8,8};
        for(int i = 0; i<arr.length; i++){
            boolean flag = false;
            int count = 0;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    flag = true;
                    break;
                }
            }
             if(flag)
                continue;
                for(int j =0; j<=i; j++){
                   if(arr[i]==arr[j])
                    count++;
                }
                   System.out.println(arr[i]+":"+count);
                }
             }
        }
    
    

