package main;

public class Treelevel {
	public void treeLevel(TreeNode tree, int level) {
		if (tree != null && level == 1)
			System.out.println(tree.value);
		else if (tree != null && level > 1) {
			level--;
			if (tree.left != null && level >= 1) {
				treeLevel(tree.left, level);

			}
			if (tree.right != null && level >= 1) {
				treeLevel(tree.right, level);

			}
		}
	}
}
