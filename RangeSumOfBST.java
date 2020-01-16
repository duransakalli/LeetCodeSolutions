class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class RangeSumOfBST {
	 public int rangeSumBST(TreeNode root, int L, int R) {
		 	if (root == null)
		 		return 0;
		 	
		 	int sum = 0;
		 	
		 	if(L <= root.val && R >= root.val)
		 		sum += root.val;
		 	
		 	if(L > root.val)
		 		sum += rangeSumBST(root.right, L, R);
		 	else if(R < root.val)
		 		sum += rangeSumBST(root.left, L, R);
		 	else
		 		sum += rangeSumBST(root.right, L, R) + rangeSumBST(root.left, L, R);
		 	
		 return sum;
	    }
}
