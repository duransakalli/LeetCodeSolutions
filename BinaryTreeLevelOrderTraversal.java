import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> treeList = new ArrayList<List<Integer>>();
        
        if(root == null)
        	return treeList;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        queue.add(root);
        
        while(!queue.isEmpty()) {
        	
        	int len = queue.size();
        	
        	List<Integer> currentList = new ArrayList<Integer>();
        	
        	for(int i = 0; i < len; i++) {
        		root = queue.poll();
        		
        		currentList.add(root.val);
        		
        		if(root.left != null)
        			queue.add(root.left);
        		if(root.right != null)
        			queue.add(root.right);
        	}
        	treeList.add(currentList);
        }
        return treeList;
    }
}
