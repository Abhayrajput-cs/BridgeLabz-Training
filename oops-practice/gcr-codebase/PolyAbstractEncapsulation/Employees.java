//interface Department {
//	void assignDepartment() ;
//	void getDepartmentDetails();
//}
//
//abstract class Employee {
//	private int employeeId;
//	String name;
//    double baseSalary;
//    int partTime;
//
//	public Employee(int employeeId,String name,double baseSalary,int partTime) {
//	 	// TODO Auto-generated constructor stub
//		this.employeeId=employeeId;
//		this.name=name;
//		this.baseSalary=baseSalary;
//		this.partTime=partTime;
//	}
//	void displayDetails()
//	{
//		System.out.println("Employee id :"+employeeId);
//		System.out.println("Employee name "+name);
//		System.out.println("Employee base Salary"+baseSalary);
//	}
//	public abstract double calculateSalary();
//
//}
//class FullTimeEmployee extends Employee implements Department{
//	public FullTimeEmployee(int employeeId, String name, double baseSalary,int partTime) {
//		super(employeeId, name, baseSalary,partTime);
//		// TODO Auto-generated constructor stub
//	}
//	@Override
//	public double calculateSalary() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	void displayDetails()
//	{
//		System.out.println("");
//		
//		
//	}
//	@Override
//	public void assignDepartment() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void getDepartmentDetails() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
// class PartTimeEmployee extends Employee{
//	 
// public PartTimeEmployee(int employeeId, String name, double baseSalary,int partTime) {
//		super(employeeId, name, baseSalary,partTime);
//		
//	}
// @Override
// public double calculateSalary() {
//	
//	return 0;
// }
//     void displayDetails()
//     {
//    	 System.out.println("Part ");
//     }
//
//	
//
// }
// 
//	public class Employees{
//
//	public static void main(String[] args) {
//      Employee emp=new FullTimeEmployee(1,"Abhay",50000,2);
//      Employee emp2=new FullTimeEmployee(2, "Abhishek", 40000,3);
//      Employee emp3=new FullTimeEmployee(3, "Akshit",55000,1);
//      Employee emp4=new PartTimeEmployee(1,"Anuj",45000,4);
//      Employee emp5=new PartTimeEmployee(2, "deepak", 40000,3);
//      Employee emp6=new PartTimeEmployee(3, "Nandini",40000,4);
//      
//      emp.displayDetails();
//      emp2.displayDetails();
//      emp3.displayDetails();
//      emp4.displayDetails();
//      emp5.displayDetails();
//      emp6.displayDetails();
//      
//      
//		
//	}
//
//}


interface Department {
    void assignDepartment();
    void getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Name          : " + name);
        System.out.println("Base Salary   : " + baseSalary);
    }

    // Abstract method
    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee implements Department {

    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public void assignDepartment() {
        System.out.println("Department Assigned: IT");
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("IT Department - Full Time Employee");
    }
}

class PartTimeEmployee extends Employee implements Department {

    private int workingHours;
    private final double ratePerHour = 500;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workingHours) {
        super(employeeId, name, baseSalary);
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        return  (workingHours * ratePerHour);
    }

    @Override
    public void assignDepartment() {
        System.out.println("Department Assigned: Support");
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Support Department - Part Time Employee");
    }
}

public class Employees {

    public static void main(String[] args) {

        // Polymorphism using Employee reference
        Employee emp1 = new FullTimeEmployee(1, "Abhay", 50000);
        Employee emp2 = new PartTimeEmployee(2, "Anuj", 10000, 40);
        Employee emp3 = new FullTimeEmployee(3, "Nandini", 45000);

        printEmployee(emp1);
        printEmployee(emp2);
        printEmployee(emp3);
    }

    public static void printEmployee(Employee emp) {
        emp.displayDetails();
        System.out.println("Total Salary : " + emp.calculateSalary());
            Department dept = (Department) emp;
            dept.assignDepartment();
            dept.getDepartmentDetails();
        }
    

    }

