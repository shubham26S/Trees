package trees;

import java.util.ArrayList;

public class ModeInBST {
	static ArrayList<TreeNode> arr = new ArrayList<>();
	public static void main(String[] args) {
		TreeNode a = new TreeNode(5);
		a.left = new TreeNode(2);
		a.right = new TreeNode(2);
		a.left.left = new TreeNode(1);
		a.right.left = new TreeNode(5);
		a.right.right = new TreeNode(6);
		ModeInBST m = new ModeInBST();
		m.InOrder(a);
		for(TreeNode t : arr){
			System.out.println(t.val);
		}
		m.mode();
		System.out.println(modeArr);
	}
	
	static ArrayList<Integer> modeArr = new ArrayList<>();
	
	void mode(){
		int v = arr.get(0).val;
		int maxCount = 0;
		for(int i = 0 ; i < arr.size(); i++){
			int element = arr.get(i).val;
			int currentC = 1;
			for(int j = 0 ; j < arr.size(); j++){
				if(arr.get(j).val == element){
					currentC++;
				}
				if(currentC > maxCount){
					v = element;
					maxCount = currentC;
				}
			}
		}
		if(maxCount > 1){
			modeArr.add(v);
		}
		//return 0;
	}
	void InOrder(TreeNode root){
		if(root == null){
			return;
		}
		InOrder(root.left);
		arr.add(root);
		InOrder(root.right);
	}
}
