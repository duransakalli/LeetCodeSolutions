import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays_II {

	 public int[] intersect(int[] nums1, int[] nums2) {
		 
		 Arrays.sort(nums1);
		 Arrays.sort(nums2);
		 
		 ArrayList<Integer> list = new ArrayList<Integer>();

		 int n1 = 0, n2 = 0;
		 
		 while(n1 < nums1.length && n2 < nums2.length)
		 {
			 if(nums1[n1] < nums2[n2])
			 {
				 n1++;
			 } else if(nums1[n1] > nums2[n2])
			 {
				 n2++;
			 } else
			 {
				 list.add(n1);
				 n1++;
				 n2++;
			 }
		 }
		
		 int[] result = new int[list.size()];
		    int i=0;
		    while(i<list.size()){
		        result[i]=list.get(i);
		        i++;
		    }
		    return result;
		
	 }
}
