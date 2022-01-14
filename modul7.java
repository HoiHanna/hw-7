public class Shape {
    public void shapeName() {
        System.out.println("Shape");

    }
}
class Square extends Shape {
    @Override
    public void shapeName() {
        System.out.println("Square");

    }

}
class Triangle extends Shape {
    @Override
    public void shapeName(){
        System.out.println("Triangle");

    }

}
class Rectangle extends Shape {
    @Override
    public void shapeName(){
        System.out.println("Rectangle");

    }

}
class Rhombus extends Shape {
    @Override
    public void shapeName(){
        System.out.println("Rhombus");

    }

}
class Circle extends Shape {
    @Override
    public void shapeName() {
        System.out.println("Circle");

    }
}
class Choice {
    public void choiceShape(Shape shape) {
        shape.shapeName();
    }

}