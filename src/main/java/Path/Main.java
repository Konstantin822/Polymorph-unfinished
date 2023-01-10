package Path;

import Shapes.Circle;
import Shapes.Shape;
import Shapes.Square;
import Shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(5);
        Triangle triangle = new Triangle(5, 5);

        Shape[] shapes = {circle, square, triangle};

        for (Shape x : shapes) {
            x.getArea();
        }


        Cat cat = new Cat("Murzik", 100, 3, 150, 3);
        Human human = new Human("Bob", 200, 5, 200, 5);
        Robot robot = new Robot("Boston dynamics", 10, 1, 20, 2);


        Participant[] participants = {cat, human, robot};

        for (Participant participant : participants) {
            participant.run();
            participant.jump();
        }
    }
    public static int arraySum(Shape[] shapes) {
        int sum = 0;
        for (Shape value : shapes) {
            sum += value;
        }
        return sum;
    }
}
