/*
Code
Testcase
Test Result
Test Result
1488. Avoid Flood in The City
Solved
Medium
Topics
premium lock icon
Companies
Hint
Your country has an infinite number of lakes. Initially, all the lakes are empty, but when it rains over the nth lake, the nth lake becomes full of water. If it rains over a lake that is full of water, there will be a flood. Your goal is to avoid floods in any lake.

Given an integer array rains where:

rains[i] > 0 means there will be rains over the rains[i] lake.
rains[i] == 0 means there are no rains this day and you can choose one lake this day and dry it.
Return an array ans where:

ans.length == rains.length
ans[i] == -1 if rains[i] > 0.
ans[i] is the lake you choose to dry in the ith day if rains[i] == 0.
If there are multiple valid answers return any of them. If it is impossible to avoid flood return an empty array.

Notice that if you chose to dry a full lake, it becomes empty, but if you chose to dry an empty lake, nothing changes. */
class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        Map<Integer,Integer> fullLakes = new HashMap();
        TreeSet<Integer> dryDays = new TreeSet<>();

        for(int i = 0; i < n; i++){
            if (rains[i] == 0){
                dryDays.add(i);
                ans[i] = 1;
            }else {
                int lake = rains[i];
                ans[i] = -1;

                if ( fullLakes.containsKey(lake)) {
                    int lastDay = fullLakes.get(lake);
                    Integer dryDay = dryDays.higher(lastDay);

                    if(dryDay == null) return new int[0];

                    ans[dryDay] = lake;
                    dryDays.remove(dryDay);
                }

                fullLakes.put(lake,i);
            }
        }

        return ans;
    }
}