package Genericss;

public class Student<T> {

	T id;
	T name;
	T branch;
	public T getId() {
		return id;
	}
	public void setId(T id) {
		this.id = id;
	}
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public T getBranch() {
		return branch;
	}
	public void setBranch(T branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}
	public Student(T id, T name, T branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
	}
	public Student() {
		super();
	}
	
}
