import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Q386 {
    public static void main(String[] args) {
        int n=13;
        // System.out.println(lexicalOrder(n));
        String numbers[]=new String[n]; 
        for(int i=0;i<n;i++){
            numbers[i]=String.valueOf(i+1);
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
        public static List<Integer> lexicalOrder(int n) {
        List<Integer> al =new ArrayList<>();
        int curr=1;
        for(int i=1;i<=n;i++){
            al.add(curr);
            if(curr*10<=n){
                curr*=10;
            }
            else{
                while(curr%10==9 || curr>=n){
                    curr/=10;
                }
                curr+=1;
            }
        }
        return al;
        
    }
    
    
}
