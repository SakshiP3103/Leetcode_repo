class Solution {
    public int[] findErrorNums(int[] nums) {
         int i=0;
        int[] arr = new int[2];
         while(i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
            {
               swap(nums,i,correct);

            
            }else {
                i++;
            }
        
        }
        
        
         for(int index=0;index<nums.length;index++){
                if(nums[index]!=index+1){
                    arr[0]=nums[index];
                    arr[1]=index+1;
                    
                }
            }
           return arr;
        
        
    }
    
     static void swap(int[] arr, int first, int second) {
             int temp=arr[first];
             arr[first]=arr[second];
             arr[second]=temp;
    }    
        
    
}