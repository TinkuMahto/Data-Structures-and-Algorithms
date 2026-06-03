class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []arr=new int [nums1.length+nums2.length];
        int i=0,j=0,k=-1;
        double median=Integer.MIN_VALUE;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                arr[++k]=nums1[i];
                i=i+1;
            }else if(nums1[i]>nums2[j]){
                arr[++k]=nums2[j];
                j=j+1;
            }else{
                arr[++k]=nums1[i];
                arr[++k]=nums2[j];
                i++;
                j++;
            }
        }
        while(i<nums1.length){
            arr[++k]=nums1[i];
            i=i+1;
        }
        while(j<nums2.length){
            arr[++k]=nums2[j];
            j=j+1;
        }
        int n=arr.length;
        if(n%2!=0){
            return (double)arr[n/2];
        }else{
            return (double)(arr[n/2]+arr[(n/2)-1])/2;
        }
        // return median;
        
    }
}
