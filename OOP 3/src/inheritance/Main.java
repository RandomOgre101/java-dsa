package inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box();
//        System.out.println(box.l + " " + box.w + " " + box.h);
//
//        Box box2 = new Box(4);
//        System.out.println(box2.l + " " + box2.w + " " + box2.h);
//
//        Box box3 = new Box(2,4,3);
//        System.out.println(box3.l + " " + box3.w + " " + box3.h);
//
//        Box box4 = new Box(box2);
//        System.out.println(box4.l + " " + box4.w + " " + box4.h);

//        BoxWeight box = new BoxWeight();
//        System.out.println(box.l);

        BoxPrice box = new BoxPrice(4,3,2,8,87);

        BoxPrice box2 = new BoxPrice(box);
        System.out.println(box2.price);

    }
}
