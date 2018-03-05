import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EightBallTest {
    private EightBall eightball;

    @Before
    public void before(){
//        ArrayList<String> answers = new ArrayList<>();
//        answers.add("Go have a beer then ask again!");
//        answers.add("Don't worry about it, have a beer instead!");
//        answers.add("If you can get beer, go get one.");
//        answers.add("Hydrate first!");
//        answers.add("Take a nap before worrying anymore about that!");
//        this.eightball = new EightBall(answers);

        this.eightball = new EightBall();
    }

    @Test
    public void testHasAnswers() {
        assertEquals(5, this.eightball.getNumberOfAnswers());
    }

    @Test
    public void testGetAnswerAtID() {
        assertEquals("Go have a beer then ask again!", this.eightball.getAnswerAtIndex(0));
    }

    @Test
    public void testRandomAnswer() {
        ArrayList<String> answersCopy = this.eightball.getAllAnswers();
        String randomAnswer = this.eightball.getRandomAnswer();
        assertTrue(answersCopy.contains(randomAnswer));
    }

    @Test
    public void testCanAddAnswer() {
        int length = this.eightball.getNumberOfAnswers();
        this.eightball.addAnswer("Take up smoking instead!");
        assertEquals((length + 1), this.eightball.getNumberOfAnswers());
        assertEquals("Take up smoking instead!",this.eightball.getAnswerAtIndex(length));
    }

    @Test
    public void testCanDeleteAtIndex() {
        String before_delete = this.eightball.getAnswerAtIndex(0);
        this.eightball.deleteAtIndex(0);
        String after_delete = this.eightball.getAnswerAtIndex(0);
        assertEquals("Go have a beer then ask again!",before_delete);
        assertEquals("Don't worry about it, have a beer instead!",after_delete);
    }


} // end of EightBall TEST class
