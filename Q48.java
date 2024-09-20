import java.util.Arrays;
public class Q48{
    public static void main(String[] args) {
        int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        System.out.println(Arrays.toString(matrix));
        
    }
    public static void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int arr[] :matrix){
            int left = 0;
            int right=arr.length-1;
            while(left<right){
                int temp1=arr[left];
                arr[left]=arr[right];
                arr[right]=temp1;
                right--;
                left++;
            }
        }      
    }
}