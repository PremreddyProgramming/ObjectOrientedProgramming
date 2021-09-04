package observerPatternAssgn;

public class Student implements Observer {

	private String stuName;
	private Course course = new Course();

	public Student(String stuName) {
		super();
		this.stuName = stuName;
	}

	@Override
	public void sendUpdates() {

		System.out.println("Hi" + " " + stuName + "-" + "New Assignment Posted" + "-" + course.assignment);
	}

	@Override
	public void registerCourse(Course crse) {

		course = crse;
	}

}
