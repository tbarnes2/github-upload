import java.util.ArrayList;

public class Grades {
	private ArrayList<Student> students;

	public Grades() {
		this.students = new ArrayList<Student>();
	}

	public void addStudent(Student student) {
		if (student != null) {
			this.students.add(student);
		}
	}

	public String toString() {
		String studentInfo = "";

		for (Student currentStudent : this.students) {
			studentInfo = studentInfo + currentStudent.toString() + "\n";
		}

		return studentInfo;
	}

	public double getHighestGrade() {
		Student highestSoFar = this.students.get(0);

		for (Student currentEmployee : this.students) {
			if(currentEmployee.getGrade() > highestSoFar.getGrade()) {
				highestSoFar = currentEmployee;
			}
		}
		return highestSoFar.getGrade();
	}

	public double getLowestGrade() {
		Student lowestSoFar = this.students.get(0);

		for (Student currentStudent : this.students) {
			if(currentStudent.getGrade() < lowestSoFar.getGrade()) {
				lowestSoFar = currentStudent;
			}
		}
		return lowestSoFar.getGrade();
	}

	public double getAverageGrade() {
		double total = 0;
		int count = 0;
		for (Student currentStudent : this.students) {
			total = total + currentStudent.getGrade();
			count++;
		}

		return total / count;
	}




	
}