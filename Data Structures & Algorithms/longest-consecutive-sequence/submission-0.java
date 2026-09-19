class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for(int num: nums) {
            numbers.add(num);
        }
        int longestStreak = 0;
        for(int number: numbers) {
            if(!numbers.contains(number-1)) {
                int currentStreak = 1;
                while(numbers.contains(number + currentStreak)) {
                    currentStreak++;
                }
                longestStreak = Math.max(currentStreak, longestStreak);
            }
        }
        return longestStreak;
    }
}
