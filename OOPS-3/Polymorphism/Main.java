package Polymorphism;

public class Main {
    public static void main(String[] args){
        Shapes shapes = new Shapes();
        Circle circles = new Circle();
        Shapes myShape = new Square();

        myShape.area();
    }
}
