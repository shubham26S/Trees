package trees;

public class ShortestTree {
	public static void main(String[] args) {
		ShortestTree st = new ShortestTree();
		TreeNode a = new TreeNode(3);
	//	a.left = new TreeNode(2);
		a.right = new TreeNode(5);
//		a.left.left = new TreeNode(1);
//		a.right.left = new TreeNode(4);
//		a.right.right = new TreeNode(6);
//		a.right.left.right = new TreeNode(9);

		System.out.println(	st.heightOfTree(a));
	}
	static int minVal = 0;
	int heightOfTree(TreeNode t){
		if(t == null){
			return 0;
		}
//		int heightLeft = 0;
//		int heightRight = 0;
		int heightLeft = heightOfTree(t.left);
		int heightRight = heightOfTree(t.right);
		return heightLeft > heightRight ? heightLeft + 1 : heightRight + 1;
	}

	int minTree(TreeNode t){
		if(t == null){
			return 0;
		}
		int left = minTree(t.left);
		int right = minTree(t.right);
		
		if(t.left == null){
			return right += 1;
		}
		if(t.right == null){
			return left += 1;
		}
		return left < right ? left +1 : right +1;
	}
}
