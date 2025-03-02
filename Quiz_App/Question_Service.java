import java.util.Scanner;

public class Question_Service {
    Question questions[] = new Question[4];
    private String answers[] = new String[4];
    Scanner sc = new Scanner(System.in);
    public Question_Service() {
            questions[0] = new Question( 1, "Who Devloped C Language?", "Dennis Ritchie", "Bjarne Strostrup", "James Gosling",
                    "Navin Reddy", "Dennis Ritchie");
            questions[1] = new Question(2, "Who Developed Java Language?", "Bjarne Stroustrup", "James Gosling",
                    "Dennis Ritchie", "Guido van Rossum", "Games Gosling");
            questions[2] = new Question(3, "Who Developed Python Language?", "Bjarne Stroustrup", "James Gosling",
                    "Dennis Ritchie", "Guido van Rossum","Guido van Rossum");
            questions[3] = new Question(4, "Who Developed C++ Language?", "Bjarne Stroustrup", "James Gosling",
                    "Dennis Ritchie", "Guido van Rossum","Bjarne Stroustrup");
    }
    public void showQuestions()
    {
        int i = 0;
        for (Question q : questions) {
            System.out.println("Question No. "+q.getId() +" "+ q.getQuestion());
            System.out.println(1 +"." +q.getOpt1());
            System.out.println(2 +"." +q.getOpt2());
            System.out.println(3 +"." +q.getOpt3());
            System.out.println(4 +"." +q.getOpt4());
            System.out.println("Enter answer: ");
            answers[i++] = sc.nextLine();
        }
        // sc.close();
    }
    public int getScore()
    {
        int score = 0;
        for(int i = 0; i<questions.length; i++)
        {
            if(answers[i].equals(questions[i].getAnswer())) score++;
        }
        return score;
    }
}
