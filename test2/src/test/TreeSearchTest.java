package test;

import static org.junit.Assert.*;
import main.*;

import org.junit.Test;

public class TreeSearchTest {

	@Test
	public void test() {
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
