
public class MaximumDepthOfN_aryTree {
    public int maxDepth(Node root) {
        if(root == null)
{
    return 0;
}

int depth = 0;

for(Node node: root.children)
{
    depth = Math.max(depth, maxDepth(node));
}

return depth+1;


}
}
