package trees;

public class PathSum3 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(-3);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(2);
		root.left.right.right = new TreeNode(1);
		root.right.right = new TreeNode(11);
		PathSum3 p = new PathSum3();
		System.out.println(p.pathSum(root, 8));
	}
	int count = 0;
	public int pathSum(TreeNode root, int sum) {
		if(root == null || sum == 0){
			return 0;
		}
		if(sum > root.val ){
			pathSum(root.left, sum-root.val);
			pathSum(root.right, sum-root.val);
		}
		else if(sum == root.val){
			System.out.println("Root: "+root.val);
			count++;
		}
		else{
			pathSum(root.left, sum);
			pathSum(root.right, sum);
		}
		return count;
	}
}
