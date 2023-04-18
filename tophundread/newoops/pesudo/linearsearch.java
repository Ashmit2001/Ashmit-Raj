package tophundread.newoops.pesudo;

public class linearsearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        int num = 80;
        System.out.println(fun1(arr , num));
    }
        public static int fun1(int arr[] , int num){
        for(int i =0; i<arr.length; i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}
    

