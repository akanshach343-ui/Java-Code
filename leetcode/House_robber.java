class Solution {
    public int rob(int[] nums) {
        int[] sum=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ArrayList<Integer> calSum=new ArrayList<>();
            int idx=i+1;
            int s=nums[i];
            int max=0;
            while(idx<nums.length && nums[idx]>max){
                if(idx==i+1){
                    idx++;
                }else{

                
                s+=nums[idx];
                calSum.add(s);
                idx++;
                s=0;
                max=calSum.stream().min((a,b)->b-a).get();
                }
            }
            // max=calSum.stream().min((a,b)->b-a).get();
            sum[i]=max;
            
        }
        int m=Arrays.stream(sum).max().orElse(0);
        return m;
    }
}
