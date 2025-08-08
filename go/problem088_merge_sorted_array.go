// https://leetcode.com/problems/merge-sorted-array/

func merge(nums1 []int, m int, nums2 []int, n int)  {
    if n>0 {
        for i:=0; i<n; i++ {
            nums1[m+i]=nums2[i]
        }
        sort.Slice(nums1, func(i,j int) bool {return nums1[i]<nums1[j]})
    }
}
