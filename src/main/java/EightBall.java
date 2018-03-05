import java.util.ArrayList;
import java.util.Collections;

public class EightBall {
    private ArrayList<String> answers; // array list of statements my 8ball will randomly return

    // Constructor
//    public EightBall(ArrayList<String> inputAnswers) {
    public EightBall() {

        ArrayList<String> answers = new ArrayList<>();
        answers.add("Go have a beer then ask again!");
        answers.add("Don't worry about it, have a beer instead!");
        answers.add("If you can get beer, go get one.");
        answers.add("Hydrate first!");
        answers.add("Take a nap before worrying anymore about that!");

        this.answers = answers;
    }


    // METHODS

    public int getNumberOfAnswers() {
        return this.answers.size();
    }

    public String getAnswerAtIndex(int index) {
        return this.answers.get(index);
    }

    public String getRandomAnswer(){
        Collections.shuffle(this.answers);
        return getAnswerAtIndex(0);
    }

    public ArrayList<String> getAllAnswers() {
        ArrayList<String> copyOfAnswers = new ArrayList<>(this.answers);
        return copyOfAnswers;
    }

    public void addAnswer(String a_new_answer) {
        answers.add(a_new_answer);
    }


    public void listAnswersWithIndex() {
        int counter = 1;

        for (String answer : this.answers){
            System.out.println(counter + " - " + answer);
            counter ++;
        } // end for
    }

    public void deleteAtIndex(int an_index) {
        this.answers.remove(an_index);
    }


} // end of EightBall class
