public class OnlineExam {
    public static void main(String[] args) {

        Question[] q = {
            new Question("2+2", "4"),
            new Question("Capital of India", "Delhi")
        };

        String[] ans = {"4", "Delhi"};
        Student s = new Student("Abhay", ans);

        EvaluationStrategy strategy = new ObjectiveEvaluation();
        Exam exam = new Exam(q, strategy);

        int result = exam.evaluate(s);
        System.out.println("Score = " + result);
    }
}
