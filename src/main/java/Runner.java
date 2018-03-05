import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
//        ArrayList<String> answers = new ArrayList<>();
//        answers.add("Go have a beer then ask again!");
//        answers.add("Don't worry about it, have a beer instead!");
//        answers.add("If you can get beer, go get one.");
//        answers.add("Hydrate first!");
//        answers.add("Take a nap before worrying anymore about that!");

        EightBall eightball = new EightBall();

        System.out.println(eightball.getRandomAnswer());

        eightball.addAnswer("Take up smoking instead!");
        eightball.listAnswersWithIndex();

        eightball.deleteAtIndex(5);
        eightball.listAnswersWithIndex();

    }
} // end of runner class
