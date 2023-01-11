package Path;

public class Human implements Participant {
    String name;
    private int run;
    private int jump;
    private int maxRun;
    private int maxJump;

    public Human(String name, int run, int jump, int maxRun, int maxJump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public void run() {
        Treadmill treadmill = new Treadmill(150);
        if (run <= maxRun) {
            System.out.print("Participant " + name);
            treadmill.overcome();
        } else {
            System.out.println("Participant " + name + " did not overcame the treadmill obstacle track at a distance of 200 m. "
                    + "The participant " + name + " overcame " + run + " m." );
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
