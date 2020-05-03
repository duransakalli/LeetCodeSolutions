import java.util.ArrayList;
import java.util.List;

public class MinimumDistanceBetweenBSTNodes {
    List<Integer> tree = new ArrayList<Integer>();
	public int minDiffInBST(TreeNode root) {
        addList(root);
        
        int min = Integer.MAX_VALUE;
        int temp;
        
        for(int i = 0; i < tree.size(); i++) {
        	temp = tree.get(i) - tree.get(i-1);
        	
        	min = temp < min ? temp : min;
        }
        
        return min;
    }
	
	public void addList(TreeNode root) {
		if(root == null)
			return;
		addList(root.left);
		tree.add(root.val);
		addList(root.right);
	}
}
