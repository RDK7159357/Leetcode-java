import java.util.Arrays;
public class test {
    public static void main(String[] args) {
        
        int[] numbers = {123, 456, 789};
        String s="";
        String s1="";
        for (int number : numbers) {
            while (number > 0) {
                int digit = number % 10;
                // System.out.print(digit);
                s+=digit;
                number /= 10;
            }
        }
        // System.out.println(s);
        char arr[] = new char[s.length()];
        for(int i=0;i<s.length();i++){
            // System.out.print(s.charAt(i)+" ");    
            arr[i]=s.charAt(i);
        }
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            s1+=arr[i];
        }
        // System.out.println(Arrays.toString(arr));
        System.out.println(s1);
    }
}
