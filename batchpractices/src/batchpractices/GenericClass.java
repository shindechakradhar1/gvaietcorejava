package batchpractices;

public class GenericClass<T> {

	private T t;

	public GenericClass(T t) {
		this.t=t;
	}
	
	public T getT() {
		return t;
	}
	
}
