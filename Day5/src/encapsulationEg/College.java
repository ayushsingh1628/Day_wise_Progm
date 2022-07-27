package encapsulationEg;

public class College {
	
	private int id;
	private String name;
	private String salary;

//right click -> Source -> generate getters & setters
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSalary() {
		return salary;
	}



	public void setSalary(String salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}






}
