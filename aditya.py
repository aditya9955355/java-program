class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        nums.sort()
        return nums[-k] 
# Time Complexity: O(n log n) due to sorting
# Space Complexity: O(1) if we ignore the space used by the sorting algorithm, otherwise O(n) due to the space used by the sorting algorithm.   