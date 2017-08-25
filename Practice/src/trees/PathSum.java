package trees;

class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root.val - sum == 0 && root.left == null && root.right == null)
        	return true;
       return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);

    }
    public static void main(String[] args) {
		PathSum p = new PathSum();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		
		
		System.out.println(p.hasPathSum(root, 7));
	}
}