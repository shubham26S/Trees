package trees;
import java.util.*;
public class FlattenedTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		FlattenedTree k = new FlattenedTree();
		k.Flat(root);
		for(TreeNode t : arr){
			System.out.println(t.val);
		}
	}
	static ArrayList<TreeNode> arr = new ArrayList<>();
	void Flat(TreeNode t){
		if(t == null){
			return;
		}
		arr.add(t);
		Flat(t.left);
		Flat(t.right);
	}

	void flatTree(TreeNode t){
		if(t == null){
			return;
		}
		TreeNode l = t.left;
		TreeNode r = t.right;
		t.left = null;
		
		flatTree(t.left);
		flatTree(t.right);
		t.right = l;
		TreeNode current = t;
		while(current.right != null){
			current = current.right;
		}
		current.right = r;
	}


}
