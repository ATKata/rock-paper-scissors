public class Result {

    private final boolean r;
    private final boolean draw;

    public Result(boolean r, boolean draw){
        this.r = r;
        this.draw = draw;
    }

    public boolean isWin(){
        return r;
    }

    public boolean isDraw() {
        return draw;
    }
}
