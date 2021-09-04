package observerPatternAssgn;

public interface Publisher {

	void register(Student stu);

	void unregister(Observer stu);

	void sendUpdate();

	void updates(String assignment);

}