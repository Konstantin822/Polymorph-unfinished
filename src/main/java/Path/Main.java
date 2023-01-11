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
        for (Shape x : shapes) {
            x.getArea();
            totalSum += x.getArea();
        }
        System.out.println("Total shapes sum = " + totalSum);


        Cat cat = new Cat("Murzik", 150, 3, 150, 3);
        Human human = new Human("Bob", 200, 5, 200, 5);
        Robot robot = new Robot("Boston dynamics", 10, 1, 20, 2);

        Treadmill treadmill = new Treadmill(150);
        Wall wall = new Wall(3);

        Participant[] participants = {cat, human, robot};
        Obstacle[] obstacles = {treadmill, wall};

        for (Participant participant : participants) {
            participant.run();
            participant.jump();
        }
    }
}
