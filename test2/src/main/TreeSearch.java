package main;

public class TreeSearch {
	public TreeSearch() {
	}

	public void Treesear(TreeNode tree) {
		TreeNode b = new TreeNode();
		if (tree != null) {
			if (tree.left != null) {
				b = tree.left;
				Treesear(b);
			}
			System.out.println(tree.value);
			if (tree.right != null) {
				b = tree.right;
				Treesear(b);
			}
		}
	}

	public static void main(String args[]) {
		TreeNode[] treeNodess = new TreeNode[7];
		for (int i = 0; i < 7; i++) {
			treeNodess[i] = new TreeNode();
		}
		Treescreat a = new Treescreat();
		treeNodess = a.TreesCreats();
		TreeSearch b = new TreeSearch();
		b.Treesear(treeNodess[0]);
		Treelevel c = new Treelevel();
		c.treeLevel(treeNodess[0], 3);
	}
}
