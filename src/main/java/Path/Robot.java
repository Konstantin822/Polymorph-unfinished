package Path;

public class Robot implements Participant {
    String name;
    private int run;
    private int jump;
    private int maxRun;
    private int maxJump;

    public Robot(String name, int run, int jump, int maxRun, int maxJump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
    @Override
    public void run() {
        if (run <= maxRun) {
            Treadmill treadmill = new Treadmill(150);
            System.out.print("Participant " + name);
            treadmill.overcome();
        } else {
            System.out.println("Participant " + name + " did not overcame the treadmill obstacle at a distance of 200 m. "
                    + "The participant " + name + " overcame " + run + " m.");
        }
    }
    @Override
    public void jump() {
        if (run <= maxRun) {
            Wall wall = new Wall(3);
            System.out.print("Participant " + name);
            wall.overcome();
        } else {
            System.out.println("Participant " + name + " did not pass the previous obstacle");
        }
    }
}
