class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int s=0;
        for(int n:nums){
            s+=n;
            max=Math.max(max,s);

            if(s<0){
                s=0;
            }
        }


   return max;

        // for(int i=0;i<nums.length;i++){
        //     int s=0;
        //     for(int j=i;j<nums.length;j++){
        //        s+=nums[j];
        //        max=Math.max(max,s);
        //     }
        // }
        // return max;
    }
}