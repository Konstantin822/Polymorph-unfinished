package Path;

public class Treadmill implements Obstacle {
    private int range;
    public Treadmill(int range) {
        this.range = range;
    }
    public int getRange(int range) {
        return range;
    }
    @Override
    public void overcome() {
        System.out.println("overcome " + range);
    }
}
