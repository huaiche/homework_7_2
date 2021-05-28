package competition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompetitionTest {

	@Test
	void test() {
		Competition a = new Competition(0,10,8,1,"A");
		assertEquals("project:normal",a.rent());
	}
	
	@Test
	void test1() {
		Competition a = new Competition(1,3,7,1,"A");
		assertEquals("wrong time",a.rent());
	}
	
	@Test
	void test2() {
		Competition a = new Competition(1,3,10,1,"A");
		assertEquals("wrong time",a.rent());
	}

	@Test
	void test3() {
		Competition a = new Competition(1,3,13,1,"A");
		assertEquals("wrong time",a.rent());
	}
	
	@Test
	void test4() {
		Competition a = new Competition(1,3,16,1,"A");
		assertEquals("wrong time",a.rent());
	}
	
	@Test
	void test5() {
		Competition a = new Competition(1,3,18.3,1,"A");
		assertEquals("wrong time",a.rent());
	}
	
	@Test
	void test6() {
		Competition a = new Competition(1,3,21,1,"A");
		assertEquals("wrong time",a.rent());
	}
	
	@Test
	void test7() {
		Competition a = new Competition(1,3,8,7,"A");
		assertEquals("wrong time",a.rent());
	}
	
	@Test
	void test8() {
		Competition a = new Competition(1,3,8,10.2,"A");
		assertEquals("wrong time",a.rent());
	}
	
	@Test
	void test9() {
		Competition a = new Competition(1,3,8,13,"A");
		assertEquals("wrong time",a.rent());
	}
	
	@Test
	void test10() {
		Competition a = new Competition(1,3,8,16.2,"A");
		assertEquals("wrong time",a.rent());
	}
	
	@Test
	void test11() {
		Competition a = new Competition(1,3,8,18.4,"A");
		assertEquals("wrong time",a.rent());
	}
	
	@Test
	void test12() {
		Competition a = new Competition(1,3,8,22,"A");
		assertEquals("wrong time",a.rent());
	}
	
	@Test
	void test13() {
		Competition a = new Competition(1,3,8,9.3,"A");
		assertEquals("plz rent 1 or 2 hours",a.rent());
	}
	
	@Test
	void test14() {
		Competition a = new Competition(1,3,8,10,"A");
		assertEquals("project:one lane $6000",a.rent());
	}
	
	@Test
	void test15() {
		Competition a = new Competition(1,3,8,9,"A");
		assertEquals("project:one lane $3000",a.rent());
	}
	
	@Test
	void test16() {
		Competition a = new Competition(1,9,8,10,"G");
		assertEquals("wrong time label",a.rent());
	}
	
	@Test
	void test17() {
		Competition a = new Competition(1,9,8,10,"A");
		assertEquals("project:time rent $750",a.rent());
	}
	
	@Test
	void test18() {
		Competition a = new Competition(1,9,8,10,"B");
		assertEquals("project:time rent $750",a.rent());
	}
	
	@Test
	void test19() {
		Competition a = new Competition(1,9,8,10,"C");
		assertEquals("project:time rent $750",a.rent());
	}
	
	@Test
	void test20() {
		Competition a = new Competition(1,9,8,10,"D");
		assertEquals("project:time rent $750",a.rent());
	}
	
	@Test
	void test21() {
		Competition a = new Competition(1,9,8,10,"E");
		assertEquals("project:time rent $750",a.rent());
	}
	
}
