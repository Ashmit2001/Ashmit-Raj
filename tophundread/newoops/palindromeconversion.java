package tophundread.newoops;

public class palindromeconversion {
    public static void main(String arrgs[]){

    int n = 100;
    int temp = n;
    int sum =0;
    while(temp!=0){
    int lastdigit = temp%10;
    sum = sum*10 + lastdigit;
    temp /=10;
    }
    if(n==sum){
        System.out.println(n);
    }else{
        n = sum+n;
    }
}
}
