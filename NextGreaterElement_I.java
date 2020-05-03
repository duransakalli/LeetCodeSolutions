
public class NextGreaterElement_I {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        
        int resIndx = 0;
        
        for(int i = 0; i < nums1.length;i++) {
        	boolean flag = false;
        	for(int j= i; j < nums2.length;i++) {
        		if(nums2[j] > nums1[i]) {
        			res[resIndx++] = nums2[j];
        			flag = true;
        			break;
        		}
        	}
        	 if(!flag)
             	res[resIndx++] = -1;
        }
       return res;        
    }
}

