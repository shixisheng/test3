package main;

public class inttoChar {
	int inntt;

	public char[] change(int inntt) {
		int b, i = 0, j = 0, k;
		int[] s = new int[25];
		char[] p = new char[25], l = { '0', '1', '2', '3', '4', '5', '6', '7',
				'8', '9', 'A', 'B', 'C', 'D', 'E' };
		while (inntt != 0) {
			b = inntt % 16;
			inntt = inntt / 16;
			s[i++] = b;
		}
		for (j = --i; j >= 0; j--) {
			k=s[j];
			p[j]=l[k];
		}
		return p;
	}

	public static void main(String[] args) {
		char[] p = new char[25];
		inttoChar A = new inttoChar();
		p = A.change(600);
		for (int i = p.length - 1; i >= 0; i--) {
			System.out.print(p[i]);
		}
		// String s = Integer.toHexString(600);
		// System.out.println(s);
	}
}
