
public class Game {

    public Result play(Gesture player, Gesture opponent) {
        return new Result(!(player == Gesture.ROCK && opponent == Gesture.PAPER) && (
                (player.ordinal() < opponent.ordinal())
                        || (player == Gesture.PAPER && opponent == Gesture.ROCK)), player == opponent);
    }
}
