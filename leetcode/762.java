class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int n=left; n<=right; n++){
            int set_bit=Integer.bitCount(n);
            if(set_bit==2 || set_bit==3 || set_bit==5 || set_bit==7 || set_bit==11 || set_bit==13 || set_bit==17 || set_bit==19){
                count++;
            }
        }
        return count;
    }
}
