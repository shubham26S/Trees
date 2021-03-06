package trees;

public class SumLeftLeaves {
	public static void main(String[] args) {
		TreeNode a = new TreeNode(0);
		a.left = new TreeNode(2);
		a.right = new TreeNode(4);
		a.left.left = new TreeNode(1);
		a.left.left.left = new TreeNode(5);
		a.left.left.right = new TreeNode(1);
		a.right.left = new TreeNode(3);
		a.right.left.right = new TreeNode(6);
		a.right.right = new TreeNode(1);
//		a.right.right.left = new TreeNode(2);
//		a.right.left.left = new TreeNode(1);
		//SumLeftLeaves s = new SumLeftLeaves();
		System.out.println(SumLeftLeaves.sumOfLeftLeaves(a));
//		System.err.println(sum);
	}
	
	static int sum = 0;
	public static int sumOfLeftLeaves(TreeNode root) {
		if(root == null){
			return 0;
		}
		if(root.left != null){
			if(root.left.left == null && root.left.right == null){
				sum +=root.left.val;
			}
			else sumOfLeftLeaves(root.left);
		}
		if(root.right != null){
			sumOfLeftLeaves(root.right);
		}
		return sum;
	}
}
