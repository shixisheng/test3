package main;

public class Treescreat {
	public TreeNode[] TreesCreats() {
		int j;

		TreeNode[] treeNodes = new TreeNode[7];
		for (j = 0; j < 7; j++)

		{
			treeNodes[j] = new TreeNode();
		}

		treeNodes[0].value = 'A';
		treeNodes[1].value = 'B';
		treeNodes[2].value = 'D';
		treeNodes[3].value = 'G';
		treeNodes[4].value = 'H';
		treeNodes[5].value = 'C';
		treeNodes[6].value = 'F';
		treeNodes[0].left = treeNodes[1];
		treeNodes[0].right = treeNodes[2];
		treeNodes[1].left = treeNodes[3];
		treeNodes[1].right = treeNodes[4];
		treeNodes[2].left = treeNodes[5];
		treeNodes[2].right = treeNodes[6];
		treeNodes[3].left = null;
		treeNodes[3].right = null;
		treeNodes[4].left = null;
		treeNodes[4].right = null;
		treeNodes[5].left = null;
		treeNodes[5].right = null;
		treeNodes[6].left = null;
		treeNodes[6].right = null;
		return treeNodes;
	}
}
