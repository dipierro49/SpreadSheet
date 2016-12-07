package es.upm.grise.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.grise.Sheet;

public class SheetTest {
	@BEFORE
	Sheet s = new Sheet();
	@Test
	public void test() {
		assertEquals("#Error", s.get("AR@"));
	}
	@Test
	public void test1() {
		assertEquals("#Error", s.get("A"));
	}

}
