// import java.util.Arrays;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int n=15;
        String []s=new String[n-1]; 
        for (int i = 1; i <= n; i++)
        {
            s[i]=String.valueOf(i);
        }
        System.out.println(Arrays.toString(s));
}
}
