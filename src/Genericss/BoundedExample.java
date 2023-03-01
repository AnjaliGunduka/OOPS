package Genericss;
//restrict the subtype of particular class
public class BoundedExample<T extends Number> {

	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void display() {
		System.out.println("Data value is : " + this.data);
	}

	public BoundedExample(T data) {
		super();
		this.data = data;
	}
	
	

}
