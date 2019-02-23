
public class StudentRecord {
	
	public int quizzOne;
	public int quizzTwo;
	public int quizzThree;
	public int midtermExam;
	public int finalExam;
	public double overallScore;
	public String letterGrade;
	
	public void calculateOverall()
	{
		overallScore = 0.40*finalExam + 0.35*midtermExam + 0.25*(((quizzOne + quizzTwo + quizzThree)*100)/30);
	}

	public void displayOverallScore()
	{
		System.out.println("The overall score is " + overallScore);
	}
	
	public void defineLetterGrade()
	{
		if (overallScore>=90)
		{
			letterGrade = "A";
			System.out.println("Your letter grade for this class is " + letterGrade);
		}
		
		else if (overallScore>=80 && overallScore<90)
		{
			letterGrade = "B";
			System.out.println("Your letter grade for this class is " + letterGrade);
		}
		
		else if (overallScore>=70 && overallScore<80)
		{
			letterGrade = "C";
			System.out.println("Your letter grade for this class is " + letterGrade);
		}
		
		else if (overallScore>=60 && overallScore<70)
		{
			letterGrade = "D";
			System.out.println("Your letter grade for this class is " + letterGrade);
		}
		
		else if (overallScore<60)
		{
			letterGrade = "F";
			System.out.println("Your letter grade for this class is " + letterGrade);
		}
	}
	
	public void displayStudentRecord()
	{
		System.out.println("Student Record:");
		System.out.println("Quizzes: " + quizzOne + "/10, " + quizzTwo + "/10, " + quizzThree + "/10");
		System.out.println("Midterm: " + midtermExam + "; Final: " + finalExam);
	}
	
	public String toString()
	{
		return("Quizzes: " + quizzOne +  ", " + quizzTwo + ", " + quizzThree + "; Midterm: " + midtermExam + "; Final: " + finalExam + "; Grade " + overallScore + " " + letterGrade);
	}
	
	public boolean equals(StudentRecord student)
	{
		return ( (letterGrade.equals(student.letterGrade)));
	}
}
