package Path;

public class Robot implements Participant {
    private String name;

    public Robot(String name) {
        this.name = name;
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
