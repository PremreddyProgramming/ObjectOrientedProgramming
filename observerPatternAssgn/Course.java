package observerPatternAssgn;

import java.util.ArrayList;
import java.util.List;

public class Course implements Publisher {

	List<Student> stdns = new ArrayList();

	protected String assignment;

	@Override
	public void register(Student stu) {
		stdns.add(stu);

	}

	@Override
	public void unregister(Observer stu) {
		stdns.remove(stu);

	}

	@Override
	public void sendUpdate() {

		for (Observer stu : stdns) {

			stu.sendUpdates();
		}

	}

	@Override
	public void updates(String assignment) {
		this.assignment = assignment;
		sendUpdate();

	}
}
