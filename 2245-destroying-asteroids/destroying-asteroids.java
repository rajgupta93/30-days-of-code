class Solution
 {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        Long longmass = (long) mass;

        for(int i: asteroids) {
            if(longmass < i)
                return false;
            else
                longmass +=i;
        }
        return true;
    }
}