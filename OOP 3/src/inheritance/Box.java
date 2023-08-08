package inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //cube
    Box (double side) {
        this.h = side;
        this.w = side;
        this.l = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box (Box old) {
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }

    public void info() {
        System.out.println("Running the box");
    }
}
