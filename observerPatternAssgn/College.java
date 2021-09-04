package observerPatternAssgn;

public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course course = new Course();

		Student st1 = new Student("Charlie");
		Student st2 = new Student("Meghan");
		Student st3 = new Student("Vijay");
		Student st4 = new Student("Syed");
		Student st5 = new Student("Ram");
		Student st6 = new Student("Paul");

		course.register(st1);
		course.register(st2);
		course.register(st3);
		course.register(st4);
		course.register(st5);
		course.register(st6);

		st1.registerCourse(course);
		st2.registerCourse(course);
		st3.registerCourse(course);
		st4.registerCourse(course);
		st5.registerCourse(course);
		st6.registerCourse(course);

		course.updates("week 3 - Java Polymorphism");

		// Outupt after one of the Student (Charlie) un registers from the course

		course.unregister(st1);

		System.out.println("\n" + "---------------- RESULT AFTER CHARLIE UN REGISTERS COURSE -------------" + "\n");

		course.updates("week 3 - Java Polymorphism");
	}

}
