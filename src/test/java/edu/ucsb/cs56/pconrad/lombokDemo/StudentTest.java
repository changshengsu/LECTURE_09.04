package edu.ucsb.cs56.pconrad.lombokDemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StudentTest {

	@Test
	public void test_constructor_does_not_throw_exception() {
		Student s=new Student();
		assertTrue(true);
	}
	
	@Test
	public void test_getFname_and_setFname_work() {
		Student s=new Student();
		s.setFname("Phill");
		assertEquals("Phill",s.getFname());
	}

	@Test
	public void test_toString() {
		Student s=new Student();
		s.setFname("Phillip");
		s.setMname("Todd");
		s.setLname("Conrad");
		s.setPerm(1234567);
		s.setMajor("CMPSC");
		String expected="Student(perm=1234567, fname=Phillip, mname=Todd, lname=Conrad, major=CMPSC)";
		assertEquals(expected,s.toString());
	}

	@Test
	public void test_equals() {
		Student s=new Student(); Student t=new Student();
		s.setFname("Phillip");
		s.setMname("Todd");
		s.setLname("Conrad");
		s.setPerm(1234567);
		s.setMajor("CMPSC");
		
		t.setFname("Phillip");
		t.setMname("Todd");
		t.setLname("Conrad");
		t.setPerm(1234567);
		t.setMajor("CMPSC");

		assertTrue(s.equals(t));
	}

	@Test
	public void test_hashCode() {
		Student s=new Student(); Student t=new Student();
		s.setFname("Phillip");
		s.setMname("Todd");
		s.setLname("Conrad");
		s.setPerm(1234567);
		s.setMajor("CMPSC");
		
		t.setFname("Phillip");
		t.setMname("Todd");
		t.setLname("Conrad");
		t.setPerm(1234567);
		t.setMajor("CMPSC");

		assertEquals(s.hashCode(),t.hashCode());
	}

	
}
