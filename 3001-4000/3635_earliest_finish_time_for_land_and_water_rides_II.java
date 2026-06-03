class Solution {
    public static int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

        int bestWaterFinish = Integer.MAX_VALUE;
        int bestLandFinish = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;

        //first land ride then water ride
        for(int i=0; i<landStartTime.length; i++){
            bestLandFinish = Math.min(bestLandFinish, landStartTime[i]+landDuration[i]);
        }
        for(int i=0; i<waterStartTime.length; i++) {
            int finishTime = Math.max(bestLandFinish, waterStartTime[i]) + waterDuration[i];
            ans = Math.min(ans, finishTime);
        }
        
        //first water ride  then land ride
        for(int i=0; i<waterStartTime.length; i++){
            bestWaterFinish = Math.min(bestWaterFinish, waterStartTime[i]+waterDuration[i]);
        }
        for(int i=0; i<landStartTime.length; i++) {
            int finishTime = Math.max(bestWaterFinish, landStartTime[i])+landDuration[i];
            ans = Math.min(ans, finishTime);
        }
        return ans;
    }
}
