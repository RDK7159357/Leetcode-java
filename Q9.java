public class Q9 {
    public static void main(String[] args) {
        int x=121;
        System.out.println(isPalindrome(x));
        
    }
    public static boolean isPalindrome(int x) {
        int rem=0,sum=0;
        int res = x;
        while(x>0){
            rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        return sum==res;
    }
}
