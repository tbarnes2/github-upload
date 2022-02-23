class Main {
  public static void main(String[] args) {
		Student student1 = new Student("John", "Doe", 90);
		Student student2 = new Student("Jane", "Doe", 85);
		Student student3 = new Student("Santa", "Claus", 93);

		Grades gra1 = new Grades();

		gra1.addStudent(student1);
		gra1.addStudent(student2);
		gra1.addStudent(student3);

		System.out.println("\n");

		System.out.println("The expected highest score should be 93");
		System.out.printf("The actual highest score is: %.0f", gra1.getHighestGrade());

		System.out.println("\n");
		System.out.println("The expected lowest score should be 85");
		System.out.printf("The actual lowest score is: %.0f", gra1.getLowestGrade());
		System.out.println("\n");

		System.out.println("The expected average score should be 89.33");
		System.out.printf("The actual average score is: %.2f", gra1.getAverageGrade());
		
		System.out.println("\n");
		System.out.println(gra1.toString());
  }
}