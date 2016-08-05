package com.staticdemo;

public class StaticDemo {
	static int x;
	int y;

	StaticDemo() {
		x += 2;
		y++;
	}

	static int getSquare() {
		return x * x;
	}

	public static void main(String[] args) {
		StaticDemo sm1 = new StaticDemo();
		StaticDemo sm2 = new StaticDemo();
		int z = sm1.getSquare();
		System.out.print("-x" + z + "-y" + sm2.y);
	}
}
