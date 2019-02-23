public class StudentRecordDemo {

	public static void main(String[] args)
	{
		
		StudentRecord student1;
		student1 = new StudentRecord();
		student1.quizzOne = 9;
		student1.quizzTwo = 1;
		student1.quizzThree = 7;
		student1.finalExam = 98;
		student1.midtermExam = 89;
		student1.calculateOverall();
		student1.displayOverallScore();
		student1.defineLetterGrade();
		student1.displayStudentRecord();
	}
	
}
