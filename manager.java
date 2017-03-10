public class manager {
	public class manager extends employee {
	private int bonus;

	public manager(String name, String address, int salary) {
		super(name, address, salary);
	}

	public int getSalary() {
		return super.getSalary() + this.getBonus();
	}

	public int getBonus() {
		return bonus;
	}

	public voidf setBonus(int bonus) {
		this.bonus = bonus;
	}
}
}
