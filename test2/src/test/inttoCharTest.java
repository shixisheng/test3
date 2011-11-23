package test;

import static org.junit.Assert.*;

import main.inttoChar;

import org.junit.Test;

public class inttoCharTest {

	@Test
	public void test() {
		char[] p = new char[25];
		inttoChar A = new inttoChar();
		p = A.change(600);
		for (int i = p.length - 1; i >= 0; i--) {
			System.out.print(p[i]);
		}

	}

}
