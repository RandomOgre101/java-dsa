package inheritance;

public class BoxPrice extends BoxWeight{
    double price;

    BoxPrice () {
        super();
        this.price = -1;
    }

    BoxPrice (BoxPrice other) {
        this.price = other.price;
    }

    public BoxPrice(double l, double h, double w, double weight, double price) {
        super(l, h, w, weight);
        this.price = price;
    }
}
