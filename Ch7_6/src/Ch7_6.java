class Student{
	public static String teacherNo = "T100";
	private static int count = 0;
	private int stdno;
	private double test1, test2, test3;
	public Student(int no, double t1, double t2, double t3){
		stdno = no;
		test1 = t1;
		test2 = t2;
		test3 = t3;
		count++;
	}
	public static int getStudentCount(){
		return count;
	}
	private double getAverage(){
		return (test1 + test2 + test3) / 3;
	}
	public void printStudent(){
		System.out.println(stdno);
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(getAverage());
		
	}
}
public class Ch7_6 {

	public static void main(String[] args) {
		Student std1 = new Student(1, 68.0, 88.0, 56.0);
		Student std2 = new Student(2, 75.0, 46.0, 90.0);
		
		System.out.println(Student.teacherNo);
		std1.printStudent();
		std2.printStudent();
		
		System.out.println(std1.getStudentCount());
		System.out.println(std2.getStudentCount());
		//Student.teacherNo = "T101";
		std1.teacherNo = "T102";
		
		System.out.println(std1.teacherNo);
		System.out.println(std2.teacherNo);
		System.out.println(Student.teacherNo);
		

	}

}
