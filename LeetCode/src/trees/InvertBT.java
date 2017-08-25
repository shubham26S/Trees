package trees;

public class InvertBT {
	public static void main(String[] args) {
		TreeNode a = new TreeNode(3);
		a.left = new TreeNode(2);
		a.right = new TreeNode(5);
		a.left.left = new TreeNode(1);
		a.right.left = new TreeNode(4);
		a.right.right = new TreeNode(6);
		InvertBT ibt = new InvertBT();
		ibt.preOrd(a);
		
		ibt.invert(a);
		System.out.println();
		ibt.preOrd(a);
	}
	void preOrd(TreeNode t) {
		if (t == null) {
			return;
		}
		preOrd(t.left);
		System.out.println(t.val);
		preOrd(t.right);
	}
	
	TreeNode invert(TreeNode t) {
		if(t == null) {
			return null;
		}
		TreeNode r = invert(t.right);
		TreeNode l = invert(t.left);
		t.left = r;
		t.right = l;
		return t;
	}
}
