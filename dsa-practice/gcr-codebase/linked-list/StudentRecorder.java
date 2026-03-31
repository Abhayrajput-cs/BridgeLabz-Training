//class Student{
//	int rollno;
//	String name;
//	char Grade;
//	int age;
//    Student next;
//	Student(int rollno,String name,char Grade,int age)
//	{
//		this.Grade=Grade;
//		this.rollno=rollno;
//		this.name=name;
//        this.age=age;	
//        this.next=null;
//	}
//	
//}
//
//class StudentList
//{
//	Student head;
//	
//	 public void addStart(String name,int rollno,int age,char Grade)
//	 {
//		 Student newNode=new Student(rollno, name, Grade, age);
//		 newNode.next = head;
//	     head = newNode;
//	 }
//	 public void addLast(String name,int rollno,int age,char Grade)
//	 {
//		 Student newNode=new Student(rollno, name, Grade, age);
//		 if (head == null) {
//	            head = newNode;
//	            return;
//	        }
//		  Student temp = head;
//	        while (temp.next != null) {
//	            temp = temp.next;
//	        }
//	        temp.next = newNode;
//      }
//	 
//	 public void search(int rollno) {
//	        Student temp = head;
//
//	        while (temp != null) {
//	            if (temp.rollno == rollno) {
//	                System.out.println("Found: " + temp.name + ", Age is  " + temp.age + ", Grade is " + temp.Grade);
//	                return;
//	            }
//	            temp = temp.next;
//	        }
//	        System.out.println("Student not found");
//	    }
//	 public void deleteByRollNo(int rollNo) {
//	        if (head == null) return;
//
//	        if (head.rollno == rollNo) {
//	            head = head.next;
//	            System.out.println("Student deleted");
//	            return;
//	        }
//	        Student temp = head;
//	        while (temp.next != null && temp.next.rollno != rollNo) {
//	            temp = temp.next;
//	        }
//
//	        if (temp.next == null) {
//	            System.out.println("Student not found");
//	        } else {
//	            temp.next = temp.next.next;
//	            System.out.println("Student deleted");
//	        }
//	    }
//
//	
//}
//
//
//
//public class StudentRecorder {
//
//	public static void main(String[] args) {
//	}
//
//}




class StudentNode {
    int rollNo;
    String name;
    int age;
    char grade;
    StudentNode next;

    StudentNode(int rollNo, String name, int age, char grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    private StudentNode head;

    // Add at beginning
    public void addAtBeginning(int rollNo, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(int rollNo, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add at specific position (1-based index)
    public void addAtPosition(int pos, int rollNo, String name, int age, char grade) {
        if (pos == 1) {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }

        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        StudentNode temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete by Roll Number
    public void deleteByRollNo(int rollNo) {
        if (head == null) return;

        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Student deleted");
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student deleted");
        }
    }

    // Search by Roll Number
    public void search(int rollNo) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Found: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Update Grade
    public void updateGrade(int rollNo, char newGrade) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Display all students
    public void display() {
        if (head == null) {
            System.out.println("No records available");
            return;
        }

        StudentNode temp = head;
        while (temp != null) {
            System.out.println(
                "RollNo: " + temp.rollNo +
                ", Name: " + temp.name +
                ", Age: " + temp.age +
                ", Grade: " + temp.grade
            );
            temp = temp.next;
        }
    }
}

public class StudentRecorder {
    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(1, "Aman", 20, 'A');
        list.addAtEnd(2, "Riya", 21, 'B');
        list.addAtPosition(2, 3, "Rahul", 22, 'A');

        System.out.println("Student Records:");
        list.display();

        System.out.println("\nSearch Roll No 2:");
        list.search(2);

        System.out.println("\nUpdate Grade of Roll No 2:");
        list.updateGrade(2, 'A');

        System.out.println("\nDelete Roll No 1:");
        list.deleteByRollNo(1);

        System.out.println("\nFinal Student Records:");
        list.display();
    }
}
