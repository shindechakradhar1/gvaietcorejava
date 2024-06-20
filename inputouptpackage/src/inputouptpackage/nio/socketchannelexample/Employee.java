package inputouptpackage.nio.socketchannelexample;

import java.io.Serializable;

public class Employee implements Serializable{
	private Long id;
	private String name;
	// default constructor
	public Employee() {} 
	
	// Parameterized Constructor
	public Employee(Long id, String name) { 
		this.id = id;
		this.name = name;
	}

	// Getter Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// toString method
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
