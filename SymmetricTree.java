
public class SymmetricTree {
	
	class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	
	public boolean isSymmetric(TreeNode root) {
		return isSame(root, root);
    }
	
	boolean isSame(TreeNode nodeR, TreeNode nodeL)
	{
		if(nodeR == null && nodeL == null)
			return true;
		
		if(nodeR != null && nodeL != null && nodeR.val == nodeL.val) 
			return (isSame(nodeR.left, nodeL.right) && (isSame(nodeR.right, nodeL.left)));
		
		return false;
	}
}
