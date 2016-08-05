package com.aceessmodifiers;

public class AccessModifiersDemo {
	public static void main(String args[]) {
		SubClass ref1 = new SubClass(5);
		SubClass ref2 = new SubClass(10);
		System.out.println(ref1.add(ref2));
	}
}
class SupClass {
	protected int x;

	SupClass(int x) {
		this.x = x;
	}

}
class SubClass extends SupClass {
	SubClass(int x) {
		super(x);
	}

	int add(SupClass ref) {
		return x + ref.x;
	}

}
