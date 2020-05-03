import java.util.LinkedList;
import java.util.Queue;

public class IncreasingOrderSearchTree {
    public TreeNode increasingBST(TreeNode root) {
        
    	Queue<TreeNode> tree = new LinkedList<TreeNode>();
    	newTree(root, tree);
    	root = tree.remove();
    	TreeNode prev = root;
    	while(tree.size() > 0) {
    		TreeNode newNode = tree.remove();
    		prev.right = newNode;
    		prev.left = null;
    		prev = newNode;    		
    	}
    	return root;
    }
    
    public void newTree(TreeNode root, Queue<TreeNode> tree) {
    	if(root == null)
    		return;
    	newTree(root.left, tree);
    	tree.add(root);
    	newTree(root.right, tree);
    }
    
}
