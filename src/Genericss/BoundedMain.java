package Genericss;

public class BoundedMain {

	public static void main(String[] args) {
		BoundedExample<Integer> obj = new BoundedExample<>(30);
		obj.display();
		BoundedExample<Double> obj1 = new BoundedExample<>(33.3);
		obj1.display();
		BoundedExample<Float> obj2 = new BoundedExample<>(33.33f);
		obj2.display();
		//BoundedExample<String> obj3 = new BoundedExample<>("");
	}

}
