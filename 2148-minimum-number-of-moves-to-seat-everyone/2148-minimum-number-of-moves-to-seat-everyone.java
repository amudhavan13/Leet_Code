class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int sum=0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<seats.length;i++)
        {
            if(seats[i]<=students[i]|| seats[i]>=students[i])
            {
                sum+=Math.abs(seats[i]-students[i]);
            }
        }
        return sum;

    }
}