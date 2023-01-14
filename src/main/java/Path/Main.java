package Path;

import Shapes.Circle;
import Shapes.Shape;
import Shapes.Square;
import Shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        Square square = new Square(5);
        Triangle triangle = new Triangle(4, 5);
        Shape[] shapes = {circle, square, triangle};

        double totalSum = 0;
        for (Shape x: shapes) {
            x.getArea();
            totalSum += x.getArea();
        }
        System.out.println("Total area sum = " + totalSum);

        Cat cat = new Cat("Murzik", 100, 3);
        Human human = new Human("Bob");
        Robot robot = new Robot("Boston");

        Treadmill treadmill = new Treadmill(150);
        Wall wall = new Wall(5);

        Participant[] participants = new Participant[] {
                cat, human, robot
        };
        Obstacle[] obstacles = new Obstacle[] {
                treadmill, wall
        };

        for (Participant p : participants) {
            for (Obstacle o : obstacles) {
                p.runTreadmill();
                o.overcome();
                p.jumpWall();
                o.overcome();
            }
        }

    }
}
