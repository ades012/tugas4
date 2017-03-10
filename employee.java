public class employee {
	private String name;
	private String address;
	private int salary;

	public employee (String name, String address, int salary) {
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}

