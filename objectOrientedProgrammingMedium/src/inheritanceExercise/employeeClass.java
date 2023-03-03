package inheritanceExercise;

import java.math.BigDecimal;

public class employeeClass extends personClass {

	private String businessLine;
	private String employerName;
	private BigDecimal salary;


	public String getbusinessLine() {
		return businessLine;
	}

	public void setbusinessLine(String title) {
		this.businessLine = title;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}


}
