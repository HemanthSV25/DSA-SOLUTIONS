class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        // int p=1;

        for(int i=0;i<nums.length;i++){
            int p=1;
            for(int j=i;j<nums.length;j++){
                p*=nums[j];
                max=Math.max(max,p);
            }
            if(p<1){
                p=1;
            }
        }
        // for(int n:nums){
        //     p*=n;
        //     max=Math.max(max,p);
        //     if(p<1){
        //         p=1;
        //     }
        // }

        return max;
    }
}