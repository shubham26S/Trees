package trees;

public class StrFromBT {
	public static void main(String[] args) {
		TreeNode a = new TreeNode(3);
		a.left = new TreeNode(2);
		a.right = new TreeNode(5);
		a.left.left = new TreeNode(1);
		a.right.left = new TreeNode(4);
		a.right.right = new TreeNode(6);
		StrFromBT k = new StrFromBT();
		System.out.println(k.PreOrder(a));
	}
	
	String PreOrder(TreeNode t) {
		if(t == null) return "";
		String s = "";
		if(t.left == null && t.right == null) {
			s +=t.val;
			return s;
		}
		if(t.right == null) {
			s +=t.val+"("+PreOrder(t.left)+")";
			return s;
		}
		s+= t.val+"("+PreOrder(t.left)+")"+"("+PreOrder(t.right)+")";
		return s;
		
	}
}
