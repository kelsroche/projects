package grundkurs;

import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class FlowControl {
	public static void scope() {
		// Default scope is package-private.
		int x = 5;
		// Deklarationsanweisung und Zuweisung
		x++;
		// Postfix-Inkrement-Anweisung
		{
			// Anfang des ersten inneren Blocks
			long y;
			// Deklarationsanweisung
			y = x + 123456789;
			// Zuweisung
			System.out.println(y);
			// Ausgabeanweisung/Methodenaufruf
			;
			// Leere Anweisung
		}
		System.out.println(x); // Ausgabeanweisung/Methodenaufruf
		{
			// Anfang des zweiten inneren Blocks
			double d;
			// Deklarationsanweisung
			d = x + 1.5;
			// Zuweisung
			System.out.println(d);
			// Ausgabeanweisung/Methodenaufruf
		}
	}

	public static int n = 37; // FlowControl.n

	public static void main(String[] args) {
		// scope();
		// System.out.println(n);
		// switchy(5);
		// loopy();
		// weWereOnABreak();
		// algo();
		// board();
		// fixMe();
		// max(1.0, 2.0, 3.0, 4.0);
		// maxFixed(1.0, 2.0, 3.0, 4.0);
		stars();
	}

	private static String buildString1(String s, int multiplier) {
		return StringUtils.repeat(s, multiplier);
	}

	private static String buildString2(String s, int multiplier) {
		StringBuffer buffer = new StringBuffer(s);
		for (int i = 1; i < multiplier; i++) {
			buffer.append(s);
		}
		return buffer.toString();
	}

	private static void stars() {
		// 4.25
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of lines to print: ");
		int lines = in.nextInt();
		String s = "*";
		for (int i = 1; i <= lines; i++) {
			// System.out.println(buildString2(s, i));
			if (i > 1)
				s += "*";
			System.out.println(s);
		}
	}

	private static void loopy() {
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		int i = 0;
		while (i < 10) {
			i++;
			if (i % 2 != 0)
				continue;
			System.out.println(i);
		}
		do {
			i--;
			System.out.println(i);
		} while (i > 0);

	}

	private static void weWereOnABreak() {
		dieda: for (int k = 0; k < 5; k++) {
			for (int i = 0; i < 5; i++) {
				System.out.println("i-Schleife i = " + i);
				if (k == 3)
					break dieda;
				else
					break;
			}
			System.out.println("k-Schleife k = " + k);
		}
		System.out.println("Done.");
		for (int i = 0; i < 100; i++) {
			if (i == 74)
				break;
			if (i % 9 != 0)
				continue;
			System.out.println(i);
		}
		int i = 0;
		while (true) {
			// infinite loop?
			i++;
			int j = i * 30;
			if (j == 1260)
				break;
			if (i % 10 != 0)
				continue;
			System.out.println(i);
		}
	}

	public static void algo() {
		// Read integer n, set int i to 3.
		// Until i < 2n:
		// Increment i by 1.
		// Print i/(2i+1)
		int n, i;
		n = 6;
		i = 3;
		while (i < 2 * n) {
			i++;
			System.out.println(1.0 / (2.0 * i + 1.0));
		}
		for (int a = 3; a < 2 * n;) {
			a += 1;
			System.out.println(1.0 / (2.0 * a + 1.0));
		}
		i = 3;
		do {
			i += 1;
			System.out.println(1.0 / (2.0 * i + 1.0));
		} while (i < 2 * n);
	}

	public static void board() {
		// 4.21
		for (int i = 0; i < 8; i++) {
			for (int a = i + 1; a < (9 + i); a++)
				System.out.print(a + " ");
			System.out.println("");
		}
	}

	public static void fixMe() {
		// 4.23
		int x = 0, y = 4;
		if (x < 5) {
			if (x < 0)
				System.out.println("x < 0");
		} else {
			System.out.println("x >= 5");
		}
		if (x > 0) {
			System.out.println("ok! x > 0");
			System.out.println("1/x = " + (1 / x));
		}
		if (y > x) {
			int temp = x;
			x = y;
			y = temp;
			System.out.println(x + " " + y);
		}
	}

	public static void max(double a, double b, double c, double d) {
		// 4.24
		double e;
		if (b > a)
			if (c > b)
				if (d > c)
					e = d;
				else
					e = c;
			else if (d > b)
				e = d;
			else
				e = b;
		else if (c > a)
			if (d > c)
				e = d;
			else
				e = c;
		else if (d > a)
			e = d;
		else
			e = a;
		System.out.println("e = " + e);
	}

	public static void maxFixed(double a, double b, double c, double d) {
		double[] anArray = { a, b, c, d };
		Arrays.sort(anArray);
		double max1 = anArray[anArray.length - 1];

		double max2 = anArray[0];
		for (double i : anArray)
			if (i > max2)
				max2 = i;
		System.out.println(max1 + " " + max2);
	}

	public static void switchy(int n) {
		switch (n) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			// fallout.
		case 4:
			System.out.println(4);
			break;
		default:
			System.out.println("Not caught");
		}
	}
}
