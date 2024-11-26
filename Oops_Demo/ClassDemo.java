package Oops_Demo;

public class ClassDemo {
	
	// Case 1 : Class Are Inside Class You Need To Get Object Of OuterClass First
	// Then Only Main Method Will Allows To Create Object For SecondClass !

	 class Employee
	{
		int employId ;
		String name;
		String jobTitle;
		int salary;
		
		void display()
		{
			System.out.println("Employeed Id : "+ employId);
		    System.out.println("Employee Name: " + name);
		    System.out.println("Employee JobTitle: "+ jobTitle);
		    System.out.println("Employee Salary : "+ salary);
		}

	}
	 
	

	public static void main(String[] args) 
	{   
		// Case 1:
		
		/* Create First Object For OutSide Class 
		 * Formula For Object Creation Of InnerClass 
		 * Formula:  OuterClasName.InnerClassName ReferenceVarible = OuterClass ReferenceVarible And IneerClassName!
		 *     
		 */
		ClassDemo cdemo = new ClassDemo();
		ClassDemo.Employee emp = cdemo.new Employee();
		
		// Case2: OutSide Of Main Class No Need To Follow Above Conditions For Cration Of Object!
		//Employee Emp = new Employee();
		
		emp.employId= 101;
		emp.name = "Kalyan";
		emp.jobTitle = "QualityEngineer";
		emp.salary = 10000;
		emp.display();
		
		// Creating Another Object For SameClass!
		ClassDemo.Employee employee= cdemo.new Employee();
		employee.employId = 102;
		employee.name = "Pavan";
		employee.jobTitle = "SoftWareEngineer";
		employee.salary = 20000;
		employee.display();
		
		ClassDemo.Employee employ= cdemo.new Employee();
		employ.employId = 103;
		employ.name = "Renu";
		employ.jobTitle = "SoftWareEngineer";
		employ.salary = 300000;
		employ.display();
		
		Student st = new Student();
		st.studenName = "Chandan";
		st.studentClass = "PlayClass";
		st.studentId = 100010;
		st.studentRollNo = 1234568;
		
		Student stu = new Student();
		st.studenName = "Bhuvan";
		st.studentClass = "PlayClass";
		st.studentId = 100011;
		st.studentRollNo = 1134568;
		
		Student std = new Student();
		st.studenName = "Nandhan";
		st.studentClass = "PlayClass";
		st.studentId = 100012;
		st.studentRollNo = 1236568;
		
		Employ e1 = new Employ();
		e1.employeInitialise(10001, "PavanKalyan", "Assosiate", 100000);
		e1.display();
		
		std.studentInitialise("Chaithu",2020,"TenthClass",20209393);
		std.printStudent();
		
		
		
			
		
	}

}
// Case2 :
class Employ
	{
		int employId ;
		String name;
		String jobTitle;
		int salary;
		
		void display()
		{
			System.out.println("Employeed Id : "+ employId);
		    System.out.println("Employee Name: " + name);
		    System.out.println("Employee JobTitle: "+ jobTitle);
		    System.out.println("Employee Salary : "+ salary);
		}
		void employeInitialise(int empid, String name, String jobtitle, int salary)
		{
			this.employId=empid;
			this.name = name;
			this.jobTitle = jobtitle;
			this.salary = salary;
		}

	}
class Student 
{
	String studenName ;
	int studentId;
	String studentClass;
	int studentRollNo;
	
	public void printStudent()
	{
		System.out.println("Printing StudentName :" + studenName);
		System.out.println("Printing StudentId :" + studentId);
		System.out.println("Printing StudentClass :" + studentClass);
		System.out.println("Printing StudentRollNo :" + studentRollNo);
	}
	public void studentInitialise(String name, int id, String classname, int rollno)
	{
		this.studenName = name;
		this.studentId = id;
		this.studentClass = classname;
		this.studentRollNo = rollno;
	}
	
	
	
	
	
	
	
	
}


