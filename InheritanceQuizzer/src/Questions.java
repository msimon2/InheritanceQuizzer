import java.util.*;

public class Questions
	{
	static ArrayList<Questions> QuizzerQuestions = new ArrayList<Questions>();
	String question;
	int answer;
	String answer1;
	static int counter=0;
	public static void main(String [] args)
		{
		YNrunner();
		MCrunner();
		}	
	public Questions(String q, int a, String ans)
		{
		question = q;
		answer = a;
		answer1=ans;
		}
	public String getQuestion()
		{
		return question;
		}
	public int getAnswer()
		{
		return answer;
		}
	public String getAnswer1()
		{
		return answer1;
		}
	public static void YNrunner()
		{
		String question1;
		int userAnswer;
		System.out.println("Given the following, type '1' if it will work or '2' if it will not.");
		Scanner userInput = new Scanner(System.in);
		QuizzerQuestions.add(new Questions("Bird b = new Bird();",1, ""));
		QuizzerQuestions.add(new Questions("Bird b = new Wren();",1, ""));
		QuizzerQuestions.add(new Questions("Bird b = new Owl();",1, ""));
		QuizzerQuestions.add(new Questions("Wren w = new Bird();",2, ""));
		QuizzerQuestions.add(new Questions("Wren w = new Wren();",1, ""));
		QuizzerQuestions.add(new Questions("Wren w = new Owl();",2, ""));
		QuizzerQuestions.add(new Questions("Owl o = new Bird();", 2, ""));
		QuizzerQuestions.add(new Questions("Owl o = new Wren();",2, ""));
		QuizzerQuestions.add(new Questions("Bird b = new Bird(3);",1, ""));
		QuizzerQuestions.add(new Questions("Owl o = new Owl(1);",2, ""));
		QuizzerQuestions.add(new Questions("Owl o = new Wren(4);",2, ""));
		QuizzerQuestions.add(new Questions("Bird b = new Owl(6);",2, ""));
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
		String userAnswer2;
		System.out.println("Given the following, type what the output will be, exactly as shown on sheet.");
		System.out.println("Or type N if it will not work at all.");
		Scanner userInput = new Scanner(System.in);
		QuizzerQuestions.add(new Questions("Bird b = new Bird(4); b.flyMiles();",2, "12"));
		QuizzerQuestions.add(new Questions("Bird b = new Wren(); b.isNocturnal();",2, "no"));
		QuizzerQuestions.add(new Questions("Wren w = new Wren(4); w.sleepHours();",2, "40"));
		QuizzerQuestions.add(new Questions("Wren w = new Owl(); w.inTrees()",2, "N"));
		QuizzerQuestions.add(new Questions("Bird b = new Bird(); b.inTrees();",2, "always"));
		QuizzerQuestions.add(new Questions("Owl o = new Owl(); o.sleepHours();",2, "day hours"));
		QuizzerQuestions.add(new Questions("Bird b = new Owl(); b.inTrees()",2, "always"));
		QuizzerQuestions.add(new Questions("Owl o = new Bird(); o.inTrees()",2, "N"));
		QuizzerQuestions.add(new Questions("Owl h = new Owl(); h.isNocturnal()",2, "yes"));
		QuizzerQuestions.add(new Questions("Bird b = new Bird(''flying''); b.flyMiles()",2, "N"));
		QuizzerQuestions.add(new Questions("Wren x = new Bird(); x.inTrees()",2, "N"));
		QuizzerQuestions.add(new Questions("Owl k = new Owl(6); k.flyMiles()",2, "18"));


		for (int i=12;i<QuizzerQuestions.size();i++)
			{
			question1 = (QuizzerQuestions.get(i).getQuestion()); 
			System.out.println( question1 );
			userAnswer2 = userInput.nextLine();
			if (QuizzerQuestions.get(i).getAnswer1().equals(userAnswer2))
				{
				System.out.println("NICE!");
				counter++;
				}
			}
		System.out.println(counter);
		}
	}
















