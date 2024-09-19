public class Q70 {
    public static void main(String[] args) {
        int n=5;
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n) {
        if(n==0 || n==1){
            return 1;
        }
        int arr[] =new int[n+1];
        arr[0]=arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}
