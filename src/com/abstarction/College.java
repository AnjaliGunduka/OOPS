package com.abstarction;
/**
 * 
 * overriding the methods
 *
 */
public abstract class College {

	private String collegeName;

	public void collegeNames() {
		System.out.println("name of the college is :-" + collegeName);
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public College(String collegeName) {
		super();
		this.collegeName = collegeName;
	}

	public College() {
		super();
	}

	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + "]";
	}

}
