public class Solution {
    public long firstMissingPositive(long[] nums) {
        long t = Integer.MAX_VALUE * 3L;
        long ignore = -t;
        long max = Integer.MAX_VALUE * 1L + 1;
        int n = nums.length;
        boolean nth = false;
        for (int i = 0; i < n; i++) {

            if(nums[i] >= 0 && nums[i] <=n){
                if(nums[i] == n){
                    nth =true;
                    continue;
                }
                 nums[(int) nums[i]] = nums[(int) nums[i]] + t;
            }else if(nums[i] > max){
                long temp = nums[i] % t;
                if(temp >= 0 && temp <= n ){
                    if((int) temp == n){
                        nth =true;
                        continue;
                    }
                    if(nums[(int) temp] < max){
                        nums[(int) temp] += t;
                    }

                }
            }
        }
        int res = 1;
        for (int i = 1; i < n; i++) {
            if(nums[i] > max){
                res++;
            }else break;
        }
        if(res == n && nth){
            return  n + 1;
        }
        return res;
    }
}