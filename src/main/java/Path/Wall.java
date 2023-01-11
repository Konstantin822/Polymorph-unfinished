package Path;

public class Wall implements Obstacle {
    private int height;
    public Wall(int height) {
        this.height = height;
    }
    @Override
    public void overcome() {
        System.out.println(" overcame the wall obstacle at a distance of " + height + " m.");
    }
}
