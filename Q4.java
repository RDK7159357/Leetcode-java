import java.util.Arrays;

class Q4 {
    public static void main(String[] args) {
        int nums1[]={1,3};
        int nums2[]={2};
       System.out.println(findMedianSortedArrays(nums1,nums2));

  
        // System.out.println(med);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int lent=nums1.length+nums2.length;
        int arr[]=new int[lent];

        int count=0;
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
            count++;
        }
        for(int j=0;j<nums2.length;j++){
            arr[j+count]=nums2[j];
        }
        Arrays.sort(arr);
        int mid1,mid2;
        if(lent%2==0){
            mid1=lent/2;
            mid2=(lent/2)-1;
        }
        else{
            mid1=lent/2;
            mid2=(lent/2);
        }
        double med;
        if(lent%2==0){
            med = (arr[mid1]+arr[mid2])/2.0;
        }        
        else {
            med = arr[mid1];
        }   
    
        return med;
        
    }
}