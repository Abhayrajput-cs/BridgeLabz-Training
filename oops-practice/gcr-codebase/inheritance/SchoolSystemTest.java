class Person2{
	int age;
	String name;
	Person2(String name,int age)
	{
       this.age=age;
       this.name=name;
       
	}
	void displayPerson()
	{
		System.out.println("name : "+name);
		System.out.println("Age :" +age);
	}
	
}
class Teacher extends Person2{
	
	String Subject;
	
	Teacher(String name, int age,String Subject) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.Subject=Subject;
	}
	void displayRole()
	{
		System.out.println("the role is "+Subject);
	}
}
class Student extends Person2{
	
	char grade;
	
	Student(String name, int age,char grade) {
		super(name, age);
		// TODO Auto-generated constructor stub
	this.grade=grade;
	}
	void displayRole()
	{
		System.out.println("the Student grade is "+grade);
	}
}
class SchoolSystemTest{
	public static void main(String[] args) {
		Teacher teach=new Teacher("Amardeep", 29,"Sports");
		Student stu=new Student("Abhay", 21,'O');
		Person2 per=new Person2("Abhi",32);
//		
//		Person2 p1 = new Teacher("Amardeep", 29, "Sports");
//        Person2 p2 = new Student("Abhay", 21, 'O');
        
		teach.displayPerson();
		teach.displayRole();
		
		stu.displayPerson();
		stu.displayRole();
	}
	
	
}
