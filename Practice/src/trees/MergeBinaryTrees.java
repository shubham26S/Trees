package trees;

public class MergeBinaryTrees {
//    TreeNode nt = new TreeNode(0);
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		TreeNode temp = new TreeNode(0);
		if(t1 != null && t2 != null)
        	temp.val = t1.val + t2.val;
		else if(t1 == null) {
			return t2;
		}
		else {
			return t1;
		}
		
		temp.left = mergeTrees(t1.left, t2.left);
		temp.right = mergeTrees(t1.right, t2.right);
		return temp;
    }
	public static void main(String[] args) {
		TreeNode a = new TreeNode(1);
		a.left = new TreeNode(3);
		a.right = new TreeNode(2);
		a.left.left = new TreeNode(5);
		
		TreeNode b = new TreeNode(2);
		b.left = new TreeNode (1);
		b.right = new TreeNode(3);
		b.right.left = new TreeNode(4);
		b.right.right = new TreeNode(7);
		
		MergeBinaryTrees m = new MergeBinaryTrees();
		TreeNode merged = m.mergeTrees(a, b);
		m.printTree(merged);
		
	}
	
	private void printTree(TreeNode t) {
		if(t == null)
			return;
		System.out.println(t.val);
		printTree(t.left);
		printTree(t.right);
	}
	
	
}
