package Path;

public class Cat implements Participant {
    private String name;
    private int maxRange;
    private int maxHeight;

    public Cat(String name, int maxRange, int maxHeight) {
        this.name = name;
        this.maxRange = maxRange;
        this.maxHeight = maxHeight;
    }

    @Override
    public void runTreadmill() {
        System.out.print("Run ");
    }

    @Override
    public void jumpWall() {
        System.out.print("Jump ");
    }
}
