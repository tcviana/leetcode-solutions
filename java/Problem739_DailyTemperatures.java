// https://leetcode.com/problems/daily-temperatures/

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] days = new int[temperatures.length];
        for (int i=0; i<temperatures.length; i++) {
            days[i] = nextSunnyDay(temperatures, i);
        }
        days[temperatures.length-1] = 0;
        return days;
    }

    private int nextSunnyDay(int[] temp, int index) {
        int value = 0;
        for (int j=index+1; j<temp.length; j++) {
            if (temp[index]<temp[j]) {
                value = j;
                break;
            }
        }
        return value;
    }
}
