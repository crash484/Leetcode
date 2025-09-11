/*
 * 735. Asteroid Collision
Solved
Medium
Topics
premium lock icon
Companies
Hint
We are given an array asteroids of integers representing asteroids in a row. The indices of the asteriod in the array represent their relative position in space.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

 

Example 1:

Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
Example 2:

Input: asteroids = [8,-8]
Output: []
Explanation: The 8 and -8 collide exploding each other.
Example 3:

Input: asteroids = [10,2,-5]
Output: [10]
Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.
 

Constraints:

2 <= asteroids.length <= 104
-1000 <= asteroids[i] <= 1000
asteroids[i] != 0
 */

 class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<n;i++){
            int a = asteroids[i];
            boolean alive = true;

            while(alive && !st.isEmpty() && asteroids[st.peek()]>0 && a<0){
                if(Math.abs(a)>Math.abs(asteroids[st.peek()])){
                    //burst
                    st.pop();
                }else if(Math.abs(a) == Math.abs(asteroids[st.peek()])){
                    //both collided
                    st.pop();
                    alive=false;
                }else{
                    alive=false;
                }
            }

            if( alive == true){
                st.push(i);
            }
        }
        //now stack contains all indices of the asteroids that will stay
        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = asteroids[st.pop()];
        }
        return ans;
    }
}