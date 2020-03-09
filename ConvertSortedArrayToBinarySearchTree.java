


 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }


public class ConvertSortedArrayToBinarySearchTree {
	 public TreeNode sortedArrayToBST(int[] nums) {
		 TreeNode root = createTree(nums, 0, nums.length-1);
		 return root;
	  }
	 
	 public TreeNode createTree(int[] nums, int first, int last) {
		 int mid = (last - first) / 2;
		 
		 TreeNode root = new TreeNode(nums[mid]);
		 
		 root.left = createTree(nums, 1, mid-1);
		 root.right = createTree(nums, mid+1, last);
		 return root;
	 }

}
}
