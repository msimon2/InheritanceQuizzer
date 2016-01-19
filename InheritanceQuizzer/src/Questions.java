import java.util.*;

public class Questions
	{
	static ArrayList<Questions> QuizzerQuestions = new ArrayList<Questions>();
	String question;
	int answer;
	static int counter=0;
	public static void main(String [] args)
		{
		YNrunner();
		MCrunner();
		}	
	public Questions(String q, int a)
		{
		question = q;
		answer = a;
		}
	public String getQuestion()
		{
		return question;
		}
	public int getAnswer()
		{
		return answer;
		}
	public static void YNrunner()
		{
		String question1;
		int userAnswer;
		System.out.println("Given the following, type '1' if it will work or '2' if it will not.");
		Scanner userInput = new Scanner(System.in);
		QuizzerQuestions.add(new Questions("Bird b = new Bird();",1));
		QuizzerQuestions.add(new Questions("Bird b = new Wren();",1));
		QuizzerQuestions.add(new Questions("Bird b = new Owl();",2));
		QuizzerQuestions.add(new Questions("Wren w = new Bird();",2));
		QuizzerQuestions.add(new Questions("Wren w = new Wren();",1));
		QuizzerQuestions.add(new Questions("Wren w = new Owl();",2));
		QuizzerQuestions.add(new Questions("Owl o = new Bird();", 2));
		QuizzerQuestions.add(new Questions("Owl o = new Wren();",2));
		QuizzerQuestions.add(new Questions("Bird b = new Bird(3);",1));
		QuizzerQuestions.add(new Questions("Owl o = new Owl(1);",2));
		for (int i=0;i<QuizzerQuestions.size();i++)
			{
			question1 = (QuizzerQuestions.get(i).getQuestion()); 
			System.out.println("Will: " + question1 + " work?");
			userAnswer = userInput.nextInt();
			if (userAnswer == QuizzerQuestions.get(i).getAnswer())
				{
				System.out.println("NICE!");
				counter++;
				}
			}
		System.out.println(counter);
		}
	public static void MCrunner()
		{
		String question1;
		int userAnswer;
		System.out.println("Given the following, type what the output will be.");
		Scanner userInput = new Scanner(System.in);
		QuizzerQuestions.add(new Questions("Bird b = new Bird();",1));
		QuizzerQuestions.add(new Questions("Bird b = new Wren();",1));
		QuizzerQuestions.add(new Questions("Wren w = new Wren();",1));
		QuizzerQuestions.add(new Questions("Bird b = new Bird(3);",1));
		for (int i=0;i<QuizzerQuestions.size();i++)
			{
			question1 = (QuizzerQuestions.get(i).getQuestion()); 
			System.out.println("Will: " + question1 + " work?");
			userAnswer = userInput.nextInt();
			if (userAnswer == QuizzerQuestions.get(i).getAnswer())
				{
				System.out.println("NICE!");
				counter++;
				}
			}
		System.out.println(counter);
		}
	}
















