
public class FindaCorrespondingNodeofaBinaryTreeinaCloneofThatTree {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == null)
        	return null;
        if(original.val == target.val)
        	return cloned;
        
        TreeNode result = getTargetCopy(original.left, cloned.left, target);
        if(result != null)
        	return result;
        return getTargetCopy(original.right, cloned.right, target);
    }
}
