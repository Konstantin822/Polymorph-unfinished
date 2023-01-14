package Path;

public class Wall implements Obstacle {
    private int height;
    public Wall(int height) {
        this.height = height;
    }

    public int getHeight(int height) {
        return height;
    }

    @Override
    public void overcome() {
        System.out.println("overcome " + height);
    }
}
