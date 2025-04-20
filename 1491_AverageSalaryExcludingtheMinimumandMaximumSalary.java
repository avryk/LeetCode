class Solution {
    public double average(int[] salary) {
        return (double) (Arrays.stream(salary).sum()-Arrays.stream(salary).min().getAsInt()-Arrays.stream(salary).max().getAsInt())/(salary.length-2);
    }
}