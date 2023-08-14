class Solution {
    public int[] searchRange(int[] num, int target) {
        int[] ans={-1,-1};
        //checking for first occurence of target
        int start=search(num,target,true);
        int end=search(num,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;

    }

    int search(int[] num,int target,boolean findStartIndex){

        int ans=-1;
        int start =0;
        int end=num.length-1;


        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<num[mid])
            {
                end=mid-1;
            }else if(target>num[mid]){
                start=mid+1;
            }else
            {
                ans=mid;
                if(findStartIndex==true)
                {
                    end=mid-1;
                }else
                {
                    start=mid+1;
                }
            }
        }

        return ans;

    }


}