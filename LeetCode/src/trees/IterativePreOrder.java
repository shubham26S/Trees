package trees;

import java.util.Stack;

public class IterativePreOrder {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		
		IterativePreOrder i = new IterativePreOrder();
		i.preOrder(root);
		
	}
	
	
	void preOrder(TreeNode t) {
		Stack<TreeNode> s = new Stack<>();
		s.add(t);
		while(!s.isEmpty()) {
			TreeNode temp = s.pop();
			System.out.println(temp.val);
			if(temp.right != null) s.push(temp.right);

			if(temp.left != null) s.push(temp.left);
		}
	}
}
