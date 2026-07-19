class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] st = startTime.split(":");
        String[] et = endTime.split(":");
        int hr = Integer.parseInt(et[0]) - Integer.parseInt(st[0]);
        int min = Integer.parseInt(et[1]) - Integer.parseInt(st[1]);
        int sec = Integer.parseInt(et[2]) - Integer.parseInt(st[2]);

        int result = hr * 3600 + min * 60 + sec;
        return result;
        
    }
}
