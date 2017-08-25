package trees;
import java.util.*;
public class LevelAvg {
	public static ArrayList<Double> lst = new ArrayList<>();
	public List<Double> averageOfLevels(TreeNode root) {
		if(root != null) {
			Queue<TreeNode> q = new LinkedList<>();
			q.add(root);
			while(!q.isEmpty()) {
				double sum = 0.0; 
				double count = 0.0;

				int size = q.size();
				for(int i = 0 ; i < size; i++) {
					TreeNode temp = q.poll();
					sum+= temp.val;
					count++;
					if(temp.left != null) q.add(temp.left);
					if(temp.right != null) q.add(temp.right);
				}
				
			
				lst.add(sum/count);
			}
		}
		return lst;
	}
	public static void main(String[] args) {
		TreeNode a = new TreeNode(2147483647);
		a.left = new TreeNode(2147483647);
		a.right = new TreeNode(2147483647);
//		a.left.left = new TreeNode(5);
		
		TreeNode b = new TreeNode(2);
		b.left = new TreeNode (1);
		b.right = new TreeNode(3);
		b.right.left = new TreeNode(4);
		b.right.right = new TreeNode(7);
		LevelAvg lvl = new LevelAvg();
		lvl.averageOfLevels(a);
		System.out.println(lst);
	}
}
