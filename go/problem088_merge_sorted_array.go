// https://leetcode.com/problems/merge-sorted-array/

func merge(nums1 []int, m int, nums2 []int, n int)  {
   index1 := m-1
   index2 := n-1
   total := m+n-1

   for index2 >= 0 {
    if index1 >=0 && nums1[index1] >= nums2[index2] {
        nums1[total] = nums1[index1]
        index1--
    } else {
        nums1[total] = nums2[index2]
        index2--
    }
    total--
   }
}
