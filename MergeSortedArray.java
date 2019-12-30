import java.util.Arrays;
import java.util.Collections;

public class MergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
       	for(int i = 0; i < n; i++)
       	{
       		nums1[m+i] = nums2[i];
       	}
       	Arrays.sort(nums1);
       	
       	if(n == 0) return;
       	int[] nums3 = new int[n+m];
       	int i = 0, j = 0, k = 0;
       	
       	while(i < m && j < n)
       	{
       		if(nums1[i] <= nums2[j])
       		{
       			nums3[k++] = nums1[i++];
       		} else
       		{
       			nums3[k++] = nums2[j++];
       		}
       	}
       	
       	if(i == m)
       		while(j != n)
       			nums3[k++] = nums2[j++];
       	
       	else
       		while(j < m)
       			nums3[k++] = nums2[j++];
       	
       	
       	for(int l = 0; l < m+n; l++)
       	{
       		nums1[i] = nums3[i];
       	}
       	
    }
	
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0}; 
		int[] nums2 = {2,5,6};
		
		merge(nums1, 3, nums2, 3);
		
		for(int i = 0; i < nums1.length; i++)
		{
			System.out.println(nums1[i]);
		}
	}
}
