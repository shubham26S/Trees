package trees;

public class BSTToGreaterTree {
	int sum = 0;
	public TreeNode convertBST(TreeNode root) {
		convert(root);
		return root;
	}
	public void convert(TreeNode t) {
		if(t == null) {
			return;
		}
		convert(t.right); 
		t.val+=sum;
		sum = t.val;
		convert(t.left);
	}

	public static void main(String[] args) {
		BSTToGreaterTree k = new BSTToGreaterTree();
		TreeNode a = new TreeNode(3);
		a.left = new TreeNode(2);
		a.right = new TreeNode(5);
		a.left.left = new TreeNode(1);
		a.right.left = new TreeNode(4);
		a.right.right = new TreeNode(6);

		k.convertBST(a);
		k.inOrder(a);		
	}

	public void inOrder(TreeNode t) {
		if(t == null) return;
		inOrder(t.left);
		System.out.println(t.val);
		inOrder(t.right);
	}


}
