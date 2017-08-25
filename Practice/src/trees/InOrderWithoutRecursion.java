package trees;

import java.util.Stack;

public class InOrderWithoutRecursion {
	public static void main(String[] args) {
		
	}
	TreeNode root;
	void inOrder() {
		Stack<TreeNode> s = new Stack<>();
		TreeNode current = root;
		while(current != null) {
			s.push(current);
			current = current.left;
		}
		while(s.size() > 0) {
			current = s.pop();
			System.out.println(current.val);
			if(current.right != null) {
				current = current.right;
				while(current != null) {
					s.push(current);
					current = current.left; 
				}
			}
		}
		
	}
}
