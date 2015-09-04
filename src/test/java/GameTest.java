import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();

    }

    @Test
    public void rockShouldBeatScissors() {
        assertTrue(game.play(Gesture.ROCK, Gesture.SCISSORS).isWin());
    }

    @Test
    public void scissorsShouldNotBeatRock() {
        assertFalse(game.play(Gesture.SCISSORS, Gesture.ROCK).isWin());
    }

    @Test
    public void scizzorsShouldBeatPaper() {
        assertTrue(game.play(Gesture.SCISSORS, Gesture.PAPER).isWin());
    }

    @Test
    public void paperShouldNotBeatScissors() {
        assertFalse(game.play(Gesture.PAPER, Gesture.SCISSORS).isWin());
    }

    @Test
    public void paperShouldBeatRock() {
        assertTrue(game.play(Gesture.PAPER, Gesture.ROCK).isWin());
    }

    @Test
    public void rockShouldNotBeatPaper() {
        assertFalse(game.play(Gesture.ROCK, Gesture.PAPER).isWin());
    }

    @Test
    public void rockDrawsWithRock(){
        assertTrue(game.play(Gesture.ROCK, Gesture.ROCK).isDraw());
    }

    @Test
    public void rockShouldNotDrawWithPaper() throws Exception {
        assertFalse(game.play(Gesture.ROCK, Gesture.PAPER).isDraw());

    }

    @Test
    public void paperDisprovesSpock() {
        // TODO
    }
}
