import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
	static int id = 1;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter College Name");
		String college = sc.next();

		Student[] arr = new Student[3];
		Student.CollegeName = college;

		int i = 0;
		ArrayList<Student> arr1 = new ArrayList<Student>();
		for (i = 0; i <= 2; i++) {
			System.out.println("Enter Name");
			String name = sc.next();
			System.out.println("Enter Date of Birth");
			LocalDate date = LocalDate.parse(sc.next());
			System.out.println("Enter Phone Number");
			String number = sc.next();
			
			arr[i] = new Student(id++, name, date, number);
			arr1.add(arr[i]);
			System.out.println("-----------------------");
		}
	
		for (Student s : arr) {
			Info.display(s);
		}
		System.out.println("Data With Arraylist");
		for(i=0;i<=2;i++) {
			System.out.println("----------------------------");
			Info.display(arr1.get(i));
			
		}
		
		
		
		sc.close();
	}

}

class Student {
	int id;
	String name;
	LocalDate DateOfBirth;
	static String CollegeName;
	String phoneNumber;

	public Student(int id, String name, LocalDate dateOfBirth, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.DateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
	}

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

	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

class Info {
	static void display(Student s) {
		//System.out.println("----------------------------");
		System.out.println(" Student Info " + s.id);
		System.out.println("Student id: " + s.id);
		System.out.println("Student name: " + s.name);
		System.out.println("Student dateOfBirth: " + s.DateOfBirth);
		System.out.println("Student collegeName: " + Student.CollegeName);
		System.out.println("Student phoneNumber: " + s.phoneNumber);
		System.out.println("----------------------------");
	}
}

