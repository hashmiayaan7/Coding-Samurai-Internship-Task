import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Question[] questions = {
            new Question("What is the capital of India?",
                    new String[]{"1. Mumbai", "2. Delhi", "3. Kolkata", "4. Chennai"}, 2),

            new Question("Which language is used for Android development?",
                    new String[]{"1. Python", "2. Swift", "3. Java", "4. C++"}, 3),

            new Question("Who invented Java?",
                    new String[]{"1. James Gosling", "2. Dennis Ritchie", "3. Elon Musk", "4. Bill Gates"}, 1)
        };

        int score = 0;

        for (Question q : questions) {
            System.out.println("\n" + q.question);
            for (String option : q.options) {
                System.out.println(option);
            }

            System.out.print("Enter your answer: ");
            int answer = sc.nextInt();

            if (answer == q.correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }

        System.out.println("\nYour Score: " + score + "/" + questions.length);
        sc.close();
    }
}
