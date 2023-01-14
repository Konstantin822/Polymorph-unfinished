package Path;

public class Human implements Participant {
    private String name;
    public Human(String name) {
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
