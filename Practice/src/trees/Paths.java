package trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Paths {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		
		Paths p = new Paths();
		List<String> t = p.binaryTreePaths(root);
		System.out.println(t);
	}
	public List<String> binaryTreePaths(TreeNode root) {
		LinkedList<String> l = new LinkedList<>();
//		Stack<TreeNode> st = new Stack<>();
//		st.add(root);
//		while(!st.isEmpty()){
//			TreeNode t = st.pop();
//			Stack<TreeNode> temp = new Stack<>();
//			while(!st.isEmpty()){
//				TreeNode p = st.pop();
//				temp.push(p);
//			}
//			l.add(Integer.toString(t.val));
//			if(t.left != null) st.push(t.left);
//			if(t.right != null) st.push(t.right);
//		}
//		System.out.println();
		printPath(root, l, "");
		return l;
	}
	
	
	public void printPath(TreeNode t, List<String> l, String s){
		if(t.left == null && t.right == null){
			l.add(s+t.val);
		}
		if(t.left != null){
			printPath(t.left, l, s+t.val+"->");
		}
		if(t.right != null){
			printPath(t.right, l, s+t.val+"->");
		}
	}
	
	
	


}
