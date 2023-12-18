class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        return Stream.of(Arrays.stream(nums).filter(e -> e < pivot),
                Arrays.stream(nums).filter(e -> e == pivot),
                Arrays.stream(nums).filter(e -> e > pivot))
                .flatMapToInt(x -> x).toArray();
    }
}