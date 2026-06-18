class Solution {
    public double angleClock(int hour, int minutes) {
        
        if(hour==12){
            hour = 0;
        }

        double minAngle = minutes*6;
        double hourAngle =(hour + (minutes/60.0))*30;
        double result = Math.abs(minAngle-hourAngle);
        if(result>180){
            result = 360.0 - result;
        }
        
        return result;
    }
}