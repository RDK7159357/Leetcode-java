import java.util.Arrays;

class remdup {

  public static void main(String[] args) {
    int[]nums = {1,1,2};

    int count=0;
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
          // int count=0;
            if(nums[i]!=nums[j]){
                count+=1;
                
            }
        }
    }
    System.out.println(count);

  }
  // Funtion for printing array after removing duplicates
  public static void removeDuplicates(int[] nums) {
      int arr[] =new int[nums.length];
      int unicount=0;
      for(int i=0;i<nums.length;i++){
        boolean isDup=false;
        // checking if the ele is already in arr
          for(int j=0;j<unicount;j++){
              if(nums[i]==arr[j]){
                isDup=true;
                break;
      
            }
          }
        if(!isDup){
          arr[unicount]=nums[i];
          unicount++;
        }
        }
        int[]uniarr=Arrays.copyOf(arr, unicount);
        System.out.println(Arrays.toString(uniarr));


          // OR 
    //     int count=1;
    //     for(int i=1;i<nums.length;i++){
         
    //         // int count=0;
    //             if(nums[i]!=nums[i-1]){
    //                 nums[count]=nums[i];
    //                 count++;
                    
    //         }
        
    // }
    //     return count;
      }
    }