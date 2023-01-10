package Path;

public class Treadmill implements Obstacle {
    private int range;
    public Treadmill(int range) {
        this.range = range;
    }
    @Override
    public void overcome() {
        System.out.println(" overcame the treadmill obstacle at a distance of " + range + " m.");
    }
}
