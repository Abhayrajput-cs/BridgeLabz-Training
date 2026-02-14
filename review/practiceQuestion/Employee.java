
public class Employee {
	private String name;
	private String title;
	private double salary;
	public Employee(String name,String title,double salary)
	{
		this.name=name;
		this.salary=salary;
		this.title = title;
	}
	
	public void setSal(double sal){	this.salary=sal;}
	public double getSal() {return salary;}
	public String getTitle() {return title;	}
	public void setTitle(String title) {this.title = title;	}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;	}
		

}
