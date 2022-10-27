package org.group;

import org.testng.annotations.Test;

public class Group {
	@Test(groups="Sanity")
	private void test01() {
		System.out.println("test01");
	}
	@Test(groups="Smoke")
	private void test02() {
		System.out.println("test02");
	}
	@Test(groups="Reg")
	private void test03() {
		System.out.println("test03");
	}
}
