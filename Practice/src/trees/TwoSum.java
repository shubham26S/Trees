package trees;
import java.util.*;
public class TwoSum {
	public static void main(String[] args) {
		TreeNode a = new TreeNode(3);
		a.left = new TreeNode(2);
		a.right = new TreeNode(5);
		a.left.left = new TreeNode(1);
		a.right.left = new TreeNode(4);
		a.right.right = new TreeNode(6);
		TwoSum s = new TwoSum();
		System.out.println(s.findTarget(a, 12));
		
	}
	public boolean findTarget(TreeNode root, int k) {
		InOrder(root);
		int left = 0;
		int right = arr.size()-1;
		while(left < right){
			if(arr.get(left).val + arr.get(right).val == k){
				return true;
			}
			if(arr.get(left).val + arr.get(right).val > k){
				right--;
			}
			else if(arr.get(left).val + arr.get(right).val < k){
				left++;
			}
		}
//		for(int i = 0 ; i < arr.size() - 1; i++){
//			for(int j = i+1; j < arr.size(); j++){
//				if(arr.get(i).val + arr.get(j).val == k){
//					return true;
//				}
//			}
//		}
		return false;
	}
	static ArrayList <TreeNode> arr = new ArrayList<>();
	void InOrder(TreeNode t){
		if(t == null){
			return;
		}
		InOrder(t.left);
		arr.add(t);
		InOrder(t.right);
	}
}
