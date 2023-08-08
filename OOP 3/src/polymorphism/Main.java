package polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes square = new Square();

        square.area();
    }
}
