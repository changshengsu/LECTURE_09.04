package edu.ucsb.cs56.pconrad.lombokDemo;

import lombok.Data;

/**
   Student is a class that will have getters and
   setters by virtue of Lombok (<a href="https://projectlombok.org/">https://projectlombok.org</a>)
   
   It has int perm, String fname, String mname, String lname, String major;

*/


@Data
class Student {
    private int perm;
    private String fname;
	private String mname;
	private String lname;
    private String major;
}
