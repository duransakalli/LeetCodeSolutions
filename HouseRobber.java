
public class HouseRobber {
	public static int rob(int[] nums) {
        int j = 0, k = 1, jSum = 0, kSum = 0;
              	

    while(j < nums.length-1)
    {
    	jSum += nums[j];
    	kSum += nums[k];
    	j += 2;
    	k += 2;
    }
    
    System.out.println(jSum);
    System.out.println(kSum);
    if(kSum >= jSum)
    	return kSum;
    else
    	return jSum;
    }
	
	public static void main(String[] args) {
		int[] a = {2,7,9,3,1};
		System.out.println(rob(a));
		System.out.println(a.length);
	}
}
