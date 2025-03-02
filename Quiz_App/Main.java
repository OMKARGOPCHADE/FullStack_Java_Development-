public class Main {
    public static void main(String[] args) {
        Question_Service qs = new Question_Service();
        qs.showQuestions();
        System.out.println("Your Score is: "+qs.getScore());
    }
}
