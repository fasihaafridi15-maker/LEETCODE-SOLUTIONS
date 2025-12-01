class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;  // move right → peak is ahead
            } else {
                right = mid;    // move left → peak could be mid
            }
        }

        return left; // or right (both equal)
    }
}