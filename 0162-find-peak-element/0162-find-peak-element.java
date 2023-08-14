class Solution {
    public int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;

        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1])
            {
                //you are in the decreasing part of the array
                //this may be the ans,but look at left
                //this is why end!=mid-1
                end=mid;


            }
            else
            {
                //you are in the increaing part of the array
                start=mid+1;//bcz we know that mid+! element >mid element hence ignoring

            }
        }
         //in the ned start == end and pointing to the largest number because of  the two checks above
         //start and end are always trying to find max element in the above two checks hence 
         //when they r pointing to just one element,that is the max one bcz that is what the check says
         //more elaboration:at every point of start and end ,thy have the best possible
         // ans till that time and if we r saying that only one item is remmaining bcz of above line then it is th answer 
         return start;//or end any bcz they r same
        
    }
}